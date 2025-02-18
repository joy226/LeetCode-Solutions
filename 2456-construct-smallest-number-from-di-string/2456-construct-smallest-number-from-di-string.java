class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        int[] num = new int[n + 1];
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            num[count++] = i + 1;
            if(i == n || pattern.charAt(i) =='I') {
                while(count > 0) {
                    ans.append(num[--count]);
                }
            }
        }
        // for (int i = 0; i < pattern.length(); i++) {
        //     if (pattern.charAt(i) == 'I') {
        //         if (num[i] > num[i + 1]) {
        //             int temp = num[i];
        //             num[i] = num[i + 1];
        //             num[i + 1] = temp;
        //         }
        //     }
        // }
        // for(int i = 0; i < num.length; i++) {
        //     ans.append(num[i]);
        // }
        return ans.toString();
    }
}