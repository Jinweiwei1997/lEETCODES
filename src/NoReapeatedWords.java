
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl = 0;int temp=0;int start=0,repeat = 0;
        StringBuffer strin = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if(strin.indexOf(String.valueOf(s.charAt(i)))==-1) {//判断是否有某个字符
                strin=strin.append(s.charAt(i));
                temp++;
            }
            else {
                if (maxl < temp)
                    maxl = temp;
                start=s.indexOf(String.valueOf(strin),start);
                repeat=strin.indexOf(String.valueOf(s.charAt(i)));
                strin.delete(0,strin.length());
                strin.append(s.substring(start+repeat+1,i+1));
                temp=i+1-(start+repeat+1);
                start=start+repeat+1;
            }
            }
        if (temp>maxl)
            maxl=temp;
        return maxl;
    }
    }

public class NoReapeatedWords {
    public static void main(String[] args) {
    Solution solution= new Solution();
    int a=solution.lengthOfLongestSubstring("pwkeww");
    System.out.println(a);
    }
}
