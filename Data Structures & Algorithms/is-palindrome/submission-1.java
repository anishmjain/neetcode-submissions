class Solution {
    public boolean isPalindrome(String s) {
       s= s.toLowerCase().replaceAll("[^a-z0-9]", "");
       int i=0;
       int n=s.length();
       while(i<n/2)
       {
           if(s.charAt(i)!=s.charAt(n-i-1))
           {
               return false;
           }
           i++;
       }
       return true;
    }
}