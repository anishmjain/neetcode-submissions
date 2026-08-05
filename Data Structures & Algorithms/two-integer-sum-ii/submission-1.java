class Solution {
    public int[] twoSum(int[] arr, int target) {
        int s = 0, l = arr.length - 1;
        int ans[] = new int[2];
        while (s < l) {
            int sum = arr[s] + arr[l];
            int mid = (s + l) / 2;
            if (sum == target) {
                ans[0] = s + 1;
                ans[1] = l + 1;
                break;
            } else if (sum > target) {
                if (arr[s] + arr[mid] > target) {
                    l = mid - 1;
                } else {
                    l--;
                }
            } else {
                if (arr[mid] + arr[l] < target) {
                    s = mid + 1;
                } else {
                    s++;
                }
            }
        }
        return ans;

    }
}