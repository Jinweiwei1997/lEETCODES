import java.util.ArrayList;
import java.util.List;

public class ThereUnit {
public static  void main(String[] args){
    Solution15 solution=new Solution15();
    List<List<Integer>> arrayLists=solution.threeSum(new int[] {-1,0,1,2,-1,-4});
    for(int i=0;i<arrayLists.size();i++){
        System.out.println(arrayLists.get(i));
    }
}
}
class Solution15 {
    public boolean contain(List<List<Integer>>lists,List<Integer>list){
        for(int i=0;i<lists.size();i++){
        if(lists.get(i).contains(list.get(0))&&lists.get(i).contains(list.get(1))&&lists.get(i).contains(list.get(2)))
            return true;
        }
        return false;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<List<Integer>>() {};
        ArrayList<Integer> fu=new ArrayList<>();
        ArrayList<Integer> zheng=new ArrayList<>();
        ArrayList<Integer> zero=new ArrayList<>();
        for(int i=0;i<nums.length;i++){  //把正负和0分开来
            if(nums[i]>0)
                zheng.add(nums[i]);
            else if(nums[i]<0)
                fu.add(nums[i]);
            else
                zero.add(nums[i]);
        }
            for(int i=0;i<zheng.size();i++){
                for(int j=0;j<fu.size();j++){
                    if(zheng.get(i)+fu.get(j)<0){
                        for(int k=i+1;k<zheng.size();k++){
                            if(zheng.get(i)+fu.get(j)+zheng.get(k)==0){
                                ArrayList<Integer> arrayList=new ArrayList<Integer>();
                                arrayList.add(zheng.get(i));
                                arrayList.add(zheng.get(k));
                                arrayList.add(fu.get(j));
                                if(!lists.contains(arrayList))
                                    lists.add(arrayList);
                            }
                        }
                    }else if(zheng.get(i)+fu.get(j)>0){
                        for(int k=j+1;k<fu.size();k++){
                            if(zheng.get(i)+fu.get(j)+fu.get(k)==0){
                                ArrayList<Integer> arrayList=new ArrayList<Integer>();
                                arrayList.add(zheng.get(i));
                                arrayList.add(fu.get(k));
                                arrayList.add(fu.get(j));
                                if(!contain(lists,arrayList))
                                    lists.add(arrayList);
                            }
                        }
                    }else{
                        if(zero.size()>0){
                            ArrayList<Integer> arrayList=new ArrayList<Integer>();
                            arrayList.add(zheng.get(i));
                            arrayList.add(fu.get(j));
                            arrayList.add(0);
                            if(!contain(lists,arrayList))
                                lists.add(arrayList);
                        }
                    }
                }
            }
    if(zero.size()>=3){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        lists.add(arrayList);
    }
        return lists;
    }
}