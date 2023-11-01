public class hot_189 {
    public static void main(String[] args){
        //530 轮转数组
        /*给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数
输入: nums = [1,2,3,4,5,6,7], k = 3
输出: [5,6,7,1,2,3,4]
向右轮转 1 步: [7,1,2,3,4,5,6]
向右轮转 2 步: [6,7,1,2,3,4,5]
向右轮转 3 步: [5,6,7,1,2,3,4]
输入：nums = [-1,-100,3,99], k = 2
输出：[3,99,-1,-100]
向右轮转 1 步: [99,-1,-100,3]
向右轮转 2 步: [3,99,-1,-100]
         */
        int [] nums={1,2,3,4,5,6,7};
        int n=nums.length;
        int k=3;
        int[] newarr=new int[n];
        for(int i=0;i<n;++i){
            newarr[(i+k)%n]=nums[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(newarr[i] + " ");
        }
        //System.arraycopy(newarr, 0, nums, 0, n);

    }
}
