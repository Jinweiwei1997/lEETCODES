import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Vector;

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int flat1=0,flat2=0;Vector<Integer> vector=new Vector<Integer>();double middle=0;
        while(flat1<nums1.length&&flat2<nums2.length){
            if(nums1[flat1]<=nums2[flat2]){
                vector.add(nums1[flat1]);
                flat1++;
            }
            else{
                vector.add(nums2[flat2]);
                flat2++;
            }
        }
        if(flat1==nums1.length&&flat2!=nums2.length){
            while (flat2!=nums2.length){
                vector.add(nums2[flat2]);
                flat2++;
            }
        }
        if(flat2==nums2.length&&flat1!=nums1.length){
            while(flat1!=nums1.length){
                vector.add(nums1[flat1]);
                flat1++;
            }
        }
        int size=vector.size();
        if(size%2==0){
            middle=(vector.get(size / 2 - 1) + vector.get(size / 2))/2.0;
        }else{
            middle=vector.get(size/2);
        }
    return middle ;
    }
}
public class MiddleNumber {
    public static void main(String[] args) {
        Solution4 solution=new Solution4();
        double s=solution.findMedianSortedArrays(new int[]{1, 2},new int[]{3, 4});
        System.out.println(s);
    }
}
