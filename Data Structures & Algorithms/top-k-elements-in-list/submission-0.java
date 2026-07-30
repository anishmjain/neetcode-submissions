class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int[] soln = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert the HashMap into a List of entries
        // Each entry contains: (number -> frequency)
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the list by frequency in descending order
        list.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        // Pick the first k elements (highest frequencies)
        for (int i = 0; i < k; i++) {
            soln[i] = list.get(i).getKey();
        }

        return soln; 
    }
}
