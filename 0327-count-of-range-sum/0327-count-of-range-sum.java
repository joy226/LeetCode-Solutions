// Solution for countRangeSum
class Solution {
    private int lower;
    private int upper;
    private int count = 0;
    private long[] pfxSum;
    
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n = nums.length;
        this.lower = lower;
        this.upper = upper;
        
        this.pfxSum = new long[n+1];
        for (int i = 0; i < n; i++) {
            pfxSum[i+1] = pfxSum[i] + nums[i];
        }
        
        mergeSort(0, n);
        return count;
    }
	
	private void mergeSort(int low, int high){
		if (low >= high) return;
		int mid = low + (high - low) / 2;
		
        mergeSort(low, mid); 
		mergeSort(mid+1, high);
        
        int i = mid + 1, j = mid + 1;
		for (int k = low; k <= mid; k++) {
			while (i <= high && pfxSum[i] - pfxSum[k] < lower) i++;  
			while (j <= high && pfxSum[j] - pfxSum[k] <= upper) j++;
            
			count += j - i;
		}
		
		merge(low, mid, high);
	}
	
	private void merge(int low, int mid, int high) {
        long[] helper = new long[high - low + 1];
        for (int i = low; i <= high; i++) {
            helper[i - low] = pfxSum[i]; 
        }
        
		int i = low, j = mid+1;
        int idx = low;
        
        while (i <= mid && j <= high) {
            if (helper[i - low] < helper[j - low]) {
                pfxSum[idx++] = helper[i++ - low];
            } else {
                pfxSum[idx++] = helper[j++ - low];
            }
        }
        
        while (i <= mid) {
            pfxSum[idx++] = helper[i++ - low];
        }
	}
}