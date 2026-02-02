class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isMonotonicIncreasing = true;
        boolean isMonotonicDecreasing = true;
        int j;
        for (int i = 0; i < nums.length - 1; i++) {
            j = i + 1;
            if (!(i <= j && nums[i] <= nums[j])) {
                isMonotonicIncreasing = false;
                break;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            j = i + 1;
            if (!(i <= j && nums[i] >= nums[j])) {
                isMonotonicDecreasing = false;
                break;
            }
        }
        return isMonotonicIncreasing || isMonotonicDecreasing;
    }
}