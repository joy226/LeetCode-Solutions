class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> res = new Stack();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(res.isEmpty()) {
                res.push(ch);
            } else {
                char top = res.peek();
                if(top == ch) {
                    res.pop();
                } else {
                    res.push(ch);
                }
            }
        }
        for(char ch : res) {
            result.append(ch);
        }
        return result.toString();
    }
}