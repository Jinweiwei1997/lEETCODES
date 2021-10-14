public class LongestStr{
    public static void main(String[] args) {
        Solution14 solution=new Solution14();
        String s=solution.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(s);
    }
}
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer stringBuffer = new StringBuffer();
        int minLen=200,minF=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLen){
                minF=i;
                minLen=strs[i].length();
            }
        }
        int i=0,flat=1;
        for(;i<minLen;i++){

            for(int j=0;j<strs.length;j++){
                if(strs[minF].charAt(i)!=strs[j].charAt(i)) {
                    flat=0;
                    break;
                }
            }
            if(flat==0)
                break;
            stringBuffer.append(strs[minF].charAt(i));
        }
        return stringBuffer.toString();
    }
}