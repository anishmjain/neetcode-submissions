class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] sa = sortString(s);
        int[] ta = sortString(t);
        for(int i = 0; i < s.length(); i++){
            if(sa[i]!=ta[i]){
                return false;
            }
        }
        return true;
    }
    public int[] sortString(String st){
        int[] arr= new int[st.length()];
        for(int i = 0; i < st.length(); i++){
            arr[i]= st.charAt(i) - 'a';
        }
        java.util.Arrays.sort(arr);
        return arr;
    }
}
