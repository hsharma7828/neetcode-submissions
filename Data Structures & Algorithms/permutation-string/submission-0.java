class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
        return false;
    }
        int[] target = new int[26];

        for(char ch : s1.toCharArray()) {
            target[ch - 'a']++;
        }

        int[] source  = new int[26];

        for(int right= 0; right < s1.length(); right++) {
            char ch = s2.charAt(right);
            source[ch - 'a']++;
        }
        if(Arrays.equals(source, target)) {
            return true;
        }
        
        for(int right = s1.length(); right < s2.length(); right++) {
            char ch = s2.charAt(right);
            //adding character
            source[ch - 'a']++;

            char rmCh = s2.charAt(right - s1.length());
            source[rmCh -'a']--;

            if(Arrays.equals(source, target)) {
                return true;
            }
        }

        return false;
    }
}
