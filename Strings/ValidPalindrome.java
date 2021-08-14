class Solution {
    public boolean isPalindrome(String s) {
       String s1=s.replaceAll("[^a-zA-Z0-9]","");
       System.out.println("the String is "+s1);
       int n=s1.length()-1; 
        for(int i=0;i<s1.length()/2;i++)
        {
            if(Character.toLowerCase(s1.charAt(i))!=Character.toLowerCase(s1.charAt(n-i)))
            {
                System.out.println("front "+s1.charAt(i)+"---"+"End character "+s1.charAt(n-i));
                return false;
            }
        }
        return true;
    }
}