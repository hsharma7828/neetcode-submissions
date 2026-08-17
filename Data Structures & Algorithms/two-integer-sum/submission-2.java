class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer[] idx = new Integer[nums.length];
    for (int i = 0; i < nums.length; i++) idx[i] = i;
    Arrays.sort(idx, (a, b) -> nums[a] - nums[b]);
        int left = 0;
        int right = nums.length -1;

        while(left < right) {
            int sum = nums[idx[left]] + nums[idx[right]];
            if(sum == target) {
                int i = idx[left], j = idx[right];
            return i < j ? new int[]{i, j} : new int[]{j, i};
            } else if( sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[0];
    }
}
