class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merg = new StringBuilder();
        int n = Math.max(word1.length(), word2.length());
        for(int i = 0; i< n; i++) {
            if (i < word1.length()) {
                merg.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                merg.append(word2.charAt(i));
            }
        }
        return merg.toString();
    }
}