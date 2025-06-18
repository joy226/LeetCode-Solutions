class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        List<int[]> result = new ArrayList<>();
        int sortArray[] = sort(nums);
        for(int i = 0; i < n; i += 3) {
            int a = sortArray[i];
            int b = sortArray[i + 1];
            int c = sortArray[i + 2];

            if(c - a > k) {
                return new int[0][];
            }
            result.add(new int[]{a, b, c});
        }
        return result.toArray(new int[result.size()][]);
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] rigth = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, rigth);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for mix array
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it will be possible that one of the array is mot complete then we need to add all the remaining element into the mix array.
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}