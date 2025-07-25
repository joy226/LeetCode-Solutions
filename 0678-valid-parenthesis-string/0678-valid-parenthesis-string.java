class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> specialCharacter = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                stack.push(i);
            } else if (ch == '*') {
                specialCharacter.push(i);
            } else if( ch == ')') {
                if((!stack.isEmpty())) {
                    stack.pop();
                } else if (!specialCharacter.isEmpty()) {
                    specialCharacter.pop();
                } else {
                    return false;
                }
            }
        }

        while (!stack.isEmpty() && !specialCharacter.isEmpty()) {
    if (specialCharacter.peek() > stack.peek()) {
        stack.pop();
        specialCharacter.pop();
    } else {
        break;
    }
}

        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}