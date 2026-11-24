class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        OptionalInt result = Arrays.stream(nums)
                                    .filter(num -> !set.add(num))
                                    .findFirst();
        return result.isPresent();
    }
}