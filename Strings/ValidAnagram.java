class Solution {
    public boolean isAnagram(String s, String t) {
    int[] countChars=new int[26];
        
        if (s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            countChars[s.charAt(i)-'a']++;
            //This is an integer array whose length is 26 as there are 26 alphabets in english characters
            System.out.println("The difference betweem "+s.charAt(i)+" and "+"a: is "+(s.charAt(i)-'a'));
            countChars[t.charAt(i)-'a']--;
    System.out.println("The difference betweem from t string "+t.charAt(i)+" and "+"a: is "+(s.charAt(i)-'a'));
        }
        
        for(int count : countChars)
        {
            if(count!=0)
            {
                return false;
            }
        }
        return true;
}
}