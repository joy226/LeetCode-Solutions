class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int i = 0, d = 1;
        List<Character>[] row = new ArrayList[numRows];
        for(int j = 0; j < numRows; j++) {
            row[j] = new ArrayList<>();
        }

        for(char ch : s.toCharArray()) {
            row[i].add(ch);
            if(i == 0) {
                d = 1;
            } else if (i == numRows - 1) {
                d = -1;
            }
            i += d;
        }
        StringBuilder res = new StringBuilder();
        for(List<Character> r : row) {
            for(char ch : r) {
                res.append(ch);
            }
        }
        return res.toString();
    }
}