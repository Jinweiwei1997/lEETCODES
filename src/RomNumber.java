public class RomNumber {
    public static void main(String[] args) {
        Solution12 solution=new Solution12();
        String st=solution.intToRoman(1499);
        System.out.println(st);
    }
}
class Solution12 {
    public String intToRoman(int num) {
        StringBuffer stringBuffer = new StringBuffer();
        int flat = 0; //表示第一轮
        while (num != 0) {
            int a = num % 10;
            if (flat == 0) {
                switch (a) {
                    case 1:
                        stringBuffer.append('I');
                        break;
                    case 2:
                        stringBuffer.append("II");
                        break;
                    case 3:
                        stringBuffer.append("III");
                        break;
                    case 4:
                        stringBuffer.append("IV");
                        break;
                    case 5:
                        stringBuffer.append("V");
                        break;
                    case 6:
                        stringBuffer.append("VI");
                        break;
                    case 7:
                        stringBuffer.append("VII");
                        break;
                    case 8:
                        stringBuffer.append("VIII");
                        break;
                    case 9:
                        stringBuffer.append("IX");
                        break;
                }
            } else if (flat == 1) {
                switch (a) {
                    case 1:
                        stringBuffer.insert(0, 'X');
                        break;
                    case 2:
                        stringBuffer.insert(0, "XX");
                        break;
                    case 3:
                        stringBuffer.insert(0, "XXX");
                        break;
                    case 4:
                        stringBuffer.insert(0, "XL");
                        break;
                    case 5:
                        stringBuffer.insert(0, "L");
                        break;
                    case 6:
                        stringBuffer.insert(0, "LX");
                        break;
                    case 7:
                        stringBuffer.insert(0, "LXX");
                        break;
                    case 8:
                        stringBuffer.insert(0, "LXXX");
                        break;
                    case 9:
                        stringBuffer.insert(0, "XC");
                        break;
                }
            } else if (flat == 2) {
                switch (a) {
                    case 1:
                        stringBuffer.insert(0, 'C');
                        break;
                    case 2:
                        stringBuffer.insert(0, "CC");
                        break;
                    case 3:
                        stringBuffer.insert(0, "CCC");
                        break;
                    case 4:
                        stringBuffer.insert(0, "CD");
                        break;
                    case 5:
                        stringBuffer.insert(0, "D");
                        break;
                    case 6:
                        stringBuffer.insert(0, "DC");
                        break;
                    case 7:
                        stringBuffer.insert(0, "DCC");
                        break;
                    case 8:
                        stringBuffer.insert(0, "DCCC");
                        break;
                    case 9:
                        stringBuffer.insert(0, "CM");
                        break;
                }
            } else {
                switch (a) {
                    case 1:
                        stringBuffer.insert(0, 'M');
                        break;
                    case 2:
                        stringBuffer.insert(0, "MM");
                        break;
                    case 3:
                        stringBuffer.insert(0, "MMM");
                        break;

                }
            }
            num/=10;
            flat++;
        }
            return stringBuffer.toString();
        }

}