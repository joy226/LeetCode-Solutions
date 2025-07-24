class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, i);
        }
        Stack<Character> stack = new Stack<>();
        HashSet<Character> used = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(used.contains(ch)) {
                continue;
            }
            while(!stack.isEmpty() && ch < stack.peek() && map.get(stack.peek()) > i) {
                char  top = stack.pop();
                used.remove(top);
            }
            stack.push(ch);
            used.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for(Character ch : stack) {
            result.append(ch);
        }
        return result.toString();
    }
}