class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String cleaned = sb.toString();

        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}
