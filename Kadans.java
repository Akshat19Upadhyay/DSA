class Kadans {
    public static int maxSubArray(int[] nums) {
       int currSum=nums[0];
       int ans=nums[0];
       for(int i=1;i<nums.length;i++){
        if(currSum<0){
            currSum=0;
        }
        currSum=currSum+nums[i];
        if(currSum>ans){
            ans=currSum;
        }
       }
       return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,-4,5,6,7,8,9,10};
      int ans= maxSubArray(arr);
     System.out.println(ans);
    }
}