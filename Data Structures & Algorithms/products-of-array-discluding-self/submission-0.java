class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                continue;
            }
            prod *= num;
        }

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                arr[i] = 0;
            } else if (zeroCount > 0) {
                if (nums[i] == 0) {
                    arr[i] = prod;
                } else {
                    arr[i] = 0;
                }
            } else {
                arr[i] = prod / nums[i];
            }
        }

        return arr;
    }
}