class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0, size = 1;
        for (int num : nums) {
            if (num != nums[index]) {
                nums[++index] = num;
                size++;
            }
        }
        return size;
    }
}
