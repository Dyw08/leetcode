public class hot_530 {
    public static void main(String[] args){
        //530 和为k的子数组
        /*
        输入：nums = [1,1,1], k = 2
        输出：2
        输入：nums = [1,2,3], k = 3
        输出：2
         */
        int[] nums ={1,2,3};
        int k=3;
        int cout=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int end=i;end>=0;end--){
                sum+=nums[end];
                if(sum==k){
                    cout++;
                }
            }
        }
        System.out.println(cout);
    }
}
