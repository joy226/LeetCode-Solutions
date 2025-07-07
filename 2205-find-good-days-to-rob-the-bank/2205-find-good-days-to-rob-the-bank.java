class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> result = new ArrayList<>();
        // if(time == 0) {
        //     for(int i = 0; i < security.length; i++) {
        //         result.add(i);
        //     }
        //     return result;
        // }
        // for(int i = time; i < security.length - time; i++) {
        //     boolean check = true;
        //     int s = i - time;
        //     while(s < i) {
        //         if(security[s] < security[s + 1]) {
        //             check = false;
        //             break;
        //         }
        //         s++;
        //     }
        //     s = i + 1;
        //     while (s <= i + time){
        //         if (security[s] < security[s - 1]){  // security going down → invalid
        //             check = false;
        //             break;
        //         }
        //         s++;
        //     }
        //     if(check) {
        //         result.add(i);
        //     }
        // }
        // return result;

        int[] left = new int[security.length];
        int[] right = new int[security.length];
        for(int i = 1; i < security.length - 1; i++) {
            if(security[i] <= security[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 0;
            }
        }

        for(int i = security.length - 2; i >= 0; i--) {
            if(security[i] <= security[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                left[i] = 0;
            }
        }

        for(int i = time; i < security.length - time; i++) {
            if(left[i] >= time && right[i] >= time) {
                result.add(i);
            }
        }
        return result;
    }
}