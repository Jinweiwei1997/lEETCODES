import java.util.HashMap;


public class NumRomans {
    public static void main(String[] args) {
        Solution13 solution=new Solution13();
        int a=solution.romanToInt("IV");
        System.out.println(a);
    }
}
class Solution13 {
    public HashMap<Character, Integer> map=new HashMap<Character, Integer>() {{
        put('I',1);
        put('V',5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    public int romanToInt(String s) {
        int number=0;
        for(int i=0;i<s.length();i++){
            if((i<s.length()-1)&& map.get(s.charAt(i))<map.get(s.charAt(i+1) )){
                number-=map.get(s.charAt(i));
            }else number+=map.get(s.charAt(i));
        }
        return number;
    }
}
