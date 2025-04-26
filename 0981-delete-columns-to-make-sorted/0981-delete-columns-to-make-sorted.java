// class Solution {
//     public int minDeletionSize(String[] strs) {
//         int delete = 0;
//         for(int i = 0; i < strs.length; i++) {
//             if(!isSorted(strs[i])) {
//                 delete++;
//             }
//         }
//         return delete;
//     }
//     public boolean isSorted(String str) {
//         if (str == null || str.length() <= 1) {
//             return true;
//         }

//         // Check for ascending order
//         boolean isAscending = true;
//         for (int i = 0; i < str.length() - 1; i++) {
//             if (str.charAt(i) >= str.charAt(i + 1)) {
//                 isAscending = false;
//                 break;
//             }
//         }

//         // Check for descending order if not ascending
//         if (!isAscending) {
//             boolean isDescending = true;
//             for (int i = 0; i < str.length() - 1; i++) {
//                 if (str.charAt(i) <= str.charAt(i + 1)) {
//                     isDescending = false;
//                     break;
//                 }
//             }
//             return isDescending;
//         }

//         return isAscending;
//     }
// }

class Solution {
    public int minDeletionSize(String[] strs) {
        if (strs == null || strs.length == 0) {
            return 0;
        }

        int numRows = strs.length;
        int numCols = strs[0].length();
        int deleteCount = 0;

        for (int j = 0; j < numCols; j++) {
            // Check if the current column is sorted
            for (int i = 0; i < numRows - 1; i++) {
                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                    deleteCount++; // If not sorted, increment the delete count
                    break; // Move to the next column
                }
            }
        }

        return deleteCount;
    }
}