class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        // return count;
        // int count = 0;
        // for(int num: nums){
        //     String str = String.valueOf(num);
        //     if(str.length() % 2 == 0){
        //         count++;
        //     }
        // }
        return count;
    }

    public boolean even(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }

        return count % 2 == 0;
    }
}