class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i < piles.length; i++){
            if(max < piles[i]){
                max = piles[i];
            }
        }
        int start = 1;
        int end = max;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int time = timeTaken(piles,mid);
            if(time > h){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }

    public int timeTaken(int[] arr, int mid){
        int time = 0;
        for(int i = 0; i < arr.length; i++){
            double div = (double)arr[i] / (double)mid;
            time += Math.ceil(div);
        }
        return time;
    }
}