// class Solution {
//     public int numEquivDominoPairs(int[][] dominoes) {
//         int count = 0;
//         for(int i = 0; i < dominoes.length; i++) {
//             for(int j = i + 1; j < dominoes.length; j++) {
//                 if(dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1] || dominoes[i][0] == dominoes[j][1] && dominoes[i][1] == dominoes[j][0]) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100]; // Because domino values range from 1 to 9
        int result = 0;

        for (int[] d : dominoes) {
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);
            int key = a * 10 + b;
            result += count[key];
            count[key]++;
        }

        return result;
    }
}
