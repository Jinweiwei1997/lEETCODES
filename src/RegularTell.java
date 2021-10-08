public class RegularTell {
    public static void main(String[] args) {
        Solution10 solution=new Solution10();
        boolean aaa=solution.isMatch("mississippi","mis*is*p*.");
        System.out.println(aaa);
    }
}
class Solution10 {
    public boolean isMatch(String s, String p) {
        boolean flat=true;int equal=0;
        char x = 0;int time=0;int j=0;
        for(int i=0;i<p.length();i++){
            int ff=1;int zz=0;
            for(;j<s.length();j++){
                if(s.charAt(j)==p.charAt(i)) {
                    equal = 1;
                    x = s.charAt(j);
                }
                else if(p.charAt(i)=='.'){
                    x='.';
                    continue;
                }else if(p.charAt(i)=='*' &&x=='.'){
                    flat=true;
                    return  flat;
                }
                else if(p.charAt(i)=='*' && equal==1 && s.charAt(j)==x){
                    time++;
                    zz=1;
                    continue;

                }else if(s.charAt(j)!=p.charAt(i) && s.charAt(j)==x) {
                    int num = 0;
                    for (int k = i; k < p.length(); k++) {
                        if (p.charAt(k) == x)
                            num++;
                    }
                    if (time >= num) {
                        i=i+num-1;
                        equal=0;
                        break;
                    }

                }
                else if(s.charAt(j)!=p.charAt(i)&&p.charAt(i+1)=='*'){
                    i++;
                    j--;
                }
                else if(zz==1&& s.charAt(j)!=p.charAt(i)){
                    break;
                }
                else if(s.charAt(j)!=p.charAt(i)){
                    ff=0;
                    break;
                }
            j++;
                break;
            }
            if(j==p.length() &&i!=s.length())
                ff=0;
            if(ff==0){
                flat=false;
                break;
            }

        }
        return flat;
    }
}