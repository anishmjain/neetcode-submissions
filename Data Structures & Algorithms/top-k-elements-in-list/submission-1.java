class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] soln = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap =
            new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.add(entry);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        for (int i = k - 1; i >= 0; i--) {
            soln[i] = heap.poll().getKey();
        }
        return soln;
    }
}
