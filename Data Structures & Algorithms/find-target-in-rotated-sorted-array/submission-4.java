class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0] == target ? 0 : -1;
        int left = 0, right = nums.length-1;

        while(left <= right) {
            int mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;
            // 情况1：左半部分 [left, mid] 是有序的
            if(nums[left] <= nums[mid]) {
                // 判断 target 是否在 左半区间 里
                if(target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else{
                    left = mid + 1;
                }
            // 情况2：右半部分 [mid, right] 是有序的
            } else {
                if(target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
