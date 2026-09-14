class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set =  new HashSet<>();

        for(int i = 0; i< nums.length;i++) {
            int n = nums[i];

            if(i > k ) {
            set.remove(nums[i-k -1]);
            }
            if(set.contains(n)) {
                return true;
            }

            set.add(nums[i]);
        }
        return false;
    }
}