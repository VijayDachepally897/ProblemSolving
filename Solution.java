class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N=nums.length;
		int[] left_array=new int[8];
		left_array[0]=1;
		int[] righ_array=new int[8];
		righ_array[0]=1;
		int[] outarr=new int[8];
		for(int i=0;i<nums.length;i++)
		{
			left_array[i]=nums[i-1]*left_array[i-1];
		}
		for(int i=N;i>=0;i--)
		{
			righ_array[i]=nums[i+1]*righ_array[i+1];
		}
		for(int i=0;i<nums.length;i++)
		{
			outarr[i]=righ_array[i]*left_array[i];	
		}
		
		return outarr;
       }

	   
	public static void main(String[] args)
	{
		Solution obj=new Solution();
		int[] arr1 = {1,2,3,4};
		int[] output=new int[5];
		output=obj.productExceptSelf(arr1);
		System.out.println("hi");
	}
}
}