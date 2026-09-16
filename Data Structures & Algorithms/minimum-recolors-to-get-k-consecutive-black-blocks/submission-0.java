class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount = 0;
        int minWhite = Integer.MAX_VALUE;

        //Initial BLOCK
        for(int right = 0; right < k; right++) {
            if (blocks.charAt(right) == 'W') {
                whiteCount++;
                }
        }
        minWhite = Math.min(minWhite, whiteCount);

        for(int right = k; right < blocks.length(); right++) {
            if (blocks.charAt(right) == 'W') {
                whiteCount++;
                }
            if (blocks.charAt(right - k) == 'W') {
                whiteCount--;
                }
            minWhite = Math.min(minWhite, whiteCount);
        }

        return minWhite;
    }
}