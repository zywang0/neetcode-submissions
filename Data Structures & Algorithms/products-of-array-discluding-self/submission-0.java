class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int total = 1;
        for (int i = 0; i < n; i++) total *= nums[i];
        
        int[] res = new int[n];
        if (total != 0) {
            for (int i = 0; i < n; i++) {
                res[i] = total / nums[i];
            }
        } else {
            for (int i = 0; i < n; i++) {
                int product = 1;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        product *= nums[j];
                    }
                res[i] = product;
                }
            }
        }

        return res;
    }
}
