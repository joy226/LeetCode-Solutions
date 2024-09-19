class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                // we are in decreasing part of array this may be the answar but we will look at left
                end = mid;
            }
            else {
                // we are in increasing part of array this will not be our answer so we will look at right
                start = mid + 1;
            }
            // in the end, atart == end and pointing to the largest number beacse of the 2 checks above
            // start and end always trying to find max element in the above 2 checks
            // hence, when they are pointing to just 1 element, this is the maximun one because that is what the checks say.
            // more elaboration: at every point of time at start and end, they have the best possible answer till that time and if we are saying that only one element remaing hence, it our best possible answer
        }
        return end; // we can start as both are equal
    }
}