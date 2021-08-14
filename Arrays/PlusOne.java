class Solution {
    public int[] plusOne(int[] digits) {
        int count=0;
        int[] allNumber9=new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]==9)
            {
                digits[i]=0;
                count++;
            }
            else
            {
                digits[i]++;
                return digits;
            }
        }
        if(count==digits.length)
        {
            
            allNumber9[0]=1;  
            for(int i=1;i<allNumber9.length-1;i++)
            {
                allNumber9[i]=digits[i-1];
            }
            
        }
        return allNumber9;
        }
}