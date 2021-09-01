import java.util.Arrays;

//暴力的方法，但是O(n2),不是很好的算法
public class Sulution {
    public int[] twoSum(int[] nums, int target) {
        if (target<0){
            for(int i=0;i<nums.length;i++)
                nums[i]=-nums[i];
            target=-target;
        }
        int a[]=new int[2];
        a[0]=-1;
        int flat=0,flat1=0,flat2=0;
        int[] v1=new int[nums.length+1];
        for (int i=0;i<nums.length;i++){
            v1[i]=nums[i];
        }
        v1[nums.length]=target;
        Arrays.sort(v1);
        for (int i=0;i<v1.length;i++)
            if(v1[i]==target)
                flat=i;
        for(int i=0;i<flat;i++){
            for(int j=i+1;j<v1.length;j++){
                if(j==flat)
                    continue;
                if(v1[i]+v1[j]==target){
                    flat1=v1[i];
                    flat2=v1[j];
                    break;
                }
            }
        }

        for (int i=0;i<nums.length;i++){
            if(nums[i]==flat1 && a[0]==-1)
                a[0]=i;
            if(nums[i]==flat2)
                a[1]=i;
        }
        if(a[0]>a[1]){
            int t=a[0];
            a[0]=a[1];
            a[1]=t;
        }
        return a;
    }


    public static void main(String[] args) {
        int[] a = {-18,12,3,0};
        Sulution s = new Sulution();
        int[] b=s.twoSum(a, -6);
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}