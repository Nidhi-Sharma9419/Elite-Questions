class Solution {
    public int partitionDisjoint(int[] nums) {
        int max1=nums[0];
        int max2=nums[0];
        int i,res=1;
        for(i =1; i<nums.length;i++){
            if(max1>nums[i]){
                max1=max2;
                res= i+1;
            }
            else{
                max2 = Math.max(max2,nums[i]);
            }
        }
        return res;
    }
}
