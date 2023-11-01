public class hot_53 {
    public static void main(String[] args){
        /*
一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
示例 2：

输入：nums = [1]
输出：1
示例 3：

输入：nums = [5,4,-1,7,8]
输出：23
         */
        int pre=0;
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int max_res=nums[0];
        for(int i=1;i<nums.length;i++){
            pre=Math.max(pre+nums[i],nums[i]);
            max_res=Math.max(pre,max_res);
        }
        System.out.println(max_res);
    }
}
