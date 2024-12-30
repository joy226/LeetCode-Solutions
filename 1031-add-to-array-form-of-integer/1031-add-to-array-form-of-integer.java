class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = num.length - 1; i >= 0; i--) {
            list.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while(k > 0) {
            list.add(0, k % 10);
            k /= 10;
        }
    return list;
    }
}