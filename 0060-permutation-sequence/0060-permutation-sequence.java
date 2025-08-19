public class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder ans = new StringBuilder();
        ArrayList<Integer> nums = new ArrayList<>();

        // Step 1: Fill list with numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        // Step 2: Precompute factorials up to 20
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (long) i * fact[i - 1];
        }

        // Step 3: Optimization for large n (only permute last 20 digits)
        int fixed = Math.max(0, n - 20);
        for (int i = 1; i <= fixed; i++) {
            ans.append(i);
        }

        // Reduce nums to last 20 elements
        nums = new ArrayList<>(nums.subList(fixed, n));

        // Step 4: Build the k-th permutation
        k--;  // Convert to 0-based index
        while (nums.size() > 0 && k > 0) {
            int size = nums.size();
            long f = fact[size - 1];
            int index = (int) (k / f);
            if (index >= nums.size()) index = nums.size() - 1;

            ans.append(nums.get(index));
            nums.remove(index);
            k %= f;
        }

        // Add remaining digits
        for (int num : nums) {
            ans.append(num);
        }

        return ans.toString();
    }
}
