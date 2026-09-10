class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        while(left <= right) {
        int mid = (left + right) / 2;

        int totalHours = Arrays.stream(piles)
                                .map(pile -> (pile + mid -1)/mid)
                                .sum();

        if(totalHours <= h) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        }
    return left;
    }
}
