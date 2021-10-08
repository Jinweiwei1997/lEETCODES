public class MaxWater {
    public static void main(String[] args) {
        Solution11 solution=new Solution11();
        int[] z={1,8,6,2,5,4,8,3,7};
        int a=solution.maxArea(z);
        System.out.println(a);
    }
}
class Solution11 {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length;i++){
            for(int j=0;j<i;j++){
                int findm=0;
                if(height[i]>height[j])
                    findm=height[j];
                else
                    findm=height[i];
                if((i-j)*findm>max){
                    max=(i-j)*findm;
                }
            }
        }
        return max;
    }
    public class Solutiona {
        public int maxArea(int[] height) {
            int l = 0, r = height.length - 1;
            int ans = 0;
            while (l < r) {
                int area = Math.min(height[l], height[r]) * (r - l);
                ans = Math.max(ans, area);
                if (height[l] <= height[r]) {
                    ++l;
                }
                else {
                    --r;
                }
            }
            return ans;
        }
    }

}