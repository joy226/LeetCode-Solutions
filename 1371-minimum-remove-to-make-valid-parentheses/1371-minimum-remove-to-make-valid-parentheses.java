class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack <Character> stack = new Stack<>();
        int leftCount = 0;
        int rightCount = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                leftCount++;
            } 
            
            if(ch == ')') {
                rightCount++;
            }

            if(leftCount < rightCount) {
                rightCount--;
                continue;
            } else {
                stack.push(ch);
            }
        }

        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()) {
            char ch = stack.pop();
            if(leftCount > rightCount && ch == '(') {
                leftCount--;
            } else {
                res.append(ch);
            }
        }
        return res.reverse().toString();
    }
}