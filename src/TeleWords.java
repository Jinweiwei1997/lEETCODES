import java.util.ArrayList;
import java.util.List;

public class TeleWords {
    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        List<String> stringList = solution.letterCombinations("digits =  2");
        System.out.println(stringList);
    }
}

class Solution17 {
    String[] strings = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        List<String> listb = new ArrayList<>();
        List<String> listc = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < digits.length(); i++) { //找到所有的组合
            if (digits.charAt(i) <= '9' && digits.charAt(i) > '1') {
                stringBuffer.append(digits.charAt(i));
            }
        }
        stringBuffer.toString();
        for (int i = 0; i < stringBuffer.length(); i++) {
            listc.clear();
            for(int l=0;l<listb.size();l++)
                listc.add(listb.get(l));
            listb.clear();
            for (int j = 0;j==0||j < listc.size(); j++) {
                for (int k = 0; k < strings[stringBuffer.charAt(i) - '0' - 2].length(); k++) {
                    String stringBuffer1 = new String();
                    if (j != 0 || listc.size()!=0) {
                        stringBuffer1= String.valueOf(listc.get(j));
                    }
                    stringBuffer1=stringBuffer1+strings[stringBuffer.charAt(i) - '0' - 2].charAt(k);
                    listb.add(stringBuffer1);
                }
            }
        }
        return listb;
    }
}