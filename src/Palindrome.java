public class Palindrome {
    public static void main(String[] args) {
        Solution5 s=new Solution5();
        String a=s.longestPalindrome("cbbd");
        System.out.println(a);
    }
}
class Solution5 {
    public String longestPalindrome(String s) {

        String fin=new String();
        for(int i=0;i<s.length();i++){
            StringBuffer temp=new StringBuffer();
            if(i!=s.length()-1&&s.charAt(i)==s.charAt(i+1)) {//对于双数的字符
                temp.append(s.charAt(i));
                temp.append(s.charAt(i + 1));
                for (int j = 1; j < s.length() / 2 + 1; j++) {
                    if (i - j < 0 || i + 1 + j >= s.length())
                        break;
                    if (s.charAt(i - j) == s.charAt(i + j + 1)) {
                        temp.insert(0, s.charAt(i - j));
                        temp.append(s.charAt(i + j + 1));
                    } else break;
                }

                if (fin.length() < temp.length()) {
                    fin=temp.toString();
                }
            }
                if(temp.length()!=0)
                    temp.delete(0,temp.length());
                temp.append(s.charAt(i));
                for(int j=1;j<s.length()/2+1;j++){
                    if(i-j<0 || i+j>=s.length())
                        break;
                    if(s.charAt(i-j)==s.charAt(i+j)){
                        temp.insert(0,s.charAt(i-j));
                        temp.append(s.charAt(i+j));
                    }else break;
                }

            if(fin.length()<temp.length())
                fin=temp.toString();
        }
        return fin.toString();
    }
}