class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int Key = 0;
        if(ruleKey.equals("type")) {
            Key = 0;
        } else if(ruleKey.equals("color")) {
            Key = 1;
        } else if(ruleKey.equals("name")) {
            Key = 2;
        }
        for (List<String> item : items) {
            if (item.get(Key).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}