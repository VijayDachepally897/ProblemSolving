class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1)
        {
           
        }
        else{
         int [] a=new int[nums.length];
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(j==0)
                {
                    a[j]=nums[nums.length-1];
                }
                else
                {
                    a[j]=nums[j-1];
                }
            }
            for(int l=0;l<nums.length;l++)
            {
                nums[l]=a[l];
            }
        }
        }
      
    }
}