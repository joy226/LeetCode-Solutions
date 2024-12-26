class Solution {
public:
    int hcf(int a, int b){
        int i;
        while(true){
            i = b;
            b = a % b;
            a = i;
            if(b==1) return 1;
            if(a==0) return b;
            if(b==0) return a;
        }
        return -1;
    }

    bool isGoodArray(vector<int>& nums) {
        int n = nums.size();
        if(n==0) return false;
        if(n==1){
            return (nums[0] == 1 || nums[0] == -1);
        }
        int hcfi = nums[0];
        for(int i = 1; i < n; i++){
            hcfi = hcf(hcfi, nums[i]);
            if(hcfi==1){
                return true;
            }
        }
        return false;
    }
};