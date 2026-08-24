class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        int[] freq = new int[26];

        int windowSize = s.length();

        for(int right=0; right< windowSize; right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
            while((right - left + 1) - maxFreq > k) {
                char rmCh = s.charAt(left);
                freq[rmCh - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
