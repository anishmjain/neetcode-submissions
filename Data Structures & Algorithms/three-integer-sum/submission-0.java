class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            twoSum(-nums[i], nums, i + 1, result);
        }

        return result;
    }

    private void twoSum(int target, int[] nums, int startingIndex, List<List<Integer>> result) {
        int l = startingIndex, r = nums.length - 1;

        while (l < r) {
            if (nums[l] + nums[r] > target) {
                r--;
                continue;
            }

            if (nums[l] + nums[r] < target) {
                l++;
                continue;
            }
            result.add(Arrays.asList(-target, nums[l], nums[r]));
            l++;
            r--;

            while (r > l && nums[r] == nums[r + 1])
                r--;
        }
    }
}