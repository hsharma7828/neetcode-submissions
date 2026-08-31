class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

    int[] result = new int[nums.length - k + 1];

    Deque<Integer> deque = new ArrayDeque<>();

    for (int i = 0; i < nums.length; i++) {

        // 1. Remove indexes outside current window
        while (!deque.isEmpty()
                && deque.peekFirst() < i - k + 1) {
            deque.removeFirst();
        }

        // 2. Remove smaller elements from RIGHT
        while (!deque.isEmpty()
                && nums[deque.peekLast()] <= nums[i]) {
            deque.removeLast();
        }

        // 3. Add current index
        deque.addLast(i);

        // 4. Window is ready
        if (i >= k - 1) {
            result[i - k + 1] = nums[deque.peekFirst()];
        }
    }

    return result;
}
}
