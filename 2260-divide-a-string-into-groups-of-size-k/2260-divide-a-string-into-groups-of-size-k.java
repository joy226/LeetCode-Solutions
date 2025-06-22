class Solution {
    public String[] divideString(String s, int k, char fill) {
        int numChunks = (s.length() + k - 1) / k;
        String[] result = new String[numChunks];
        
        int index = 0;
        for (int i = 0; i < s.length(); i += k) {
            int end = Math.min(i + k, s.length());
            String chunk = s.substring(i, end);
            
            // Pad the last chunk if it's shorter than k
            if (chunk.length() < k) {
                StringBuilder sb = new StringBuilder(chunk);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                chunk = sb.toString();
            }
            
            result[index++] = chunk;
        }
        
        return result;
    }
}
