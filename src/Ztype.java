class Solution6 {
    public String convert(String s, int numRows) {
        int len=s.length();
        int znum=2*numRows-2;//只有一行
        int time =0;
        if(znum!=0) {
            time = len / znum;
        }
        StringBuffer stringBuffer=new StringBuffer();
        if(numRows==1){
            return s;
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<=time;j++){
                if((znum*j+i<len && i==znum/2) || (i==0&&znum*j+i<len)){
                    stringBuffer.append(s.charAt(znum*j+i));
                }else{
                    if(znum*j+i<len){
                        stringBuffer.append(s.charAt(znum*j+i));
                    if(znum*j+znum-i<len){
                        stringBuffer.append(s.charAt(znum*j+znum-i));
                    }
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
public class Ztype {
    public static void main(String[] args) {
        Solution6 solution=new Solution6();
        String a= solution.convert("AB",2);
        System.out.println(a);
    }
}
