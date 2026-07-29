class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i])
                continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && isValidAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            ans.add(group);
        }

        return ans;
    }
    public boolean isValidAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        int[] alpha = new int[26];

        for (int i = 0; i < a.length(); i++) {
            alpha[a.charAt(i) - 'a']++;
            alpha[b.charAt(i) - 'a']--;
        }

        for (int count : alpha) {
            if (count != 0)
                return false;
        }

        return true;
    }
}
