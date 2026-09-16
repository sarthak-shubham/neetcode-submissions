class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> validate;

        for (int num : nums) {
            if (validate.count(num) == 1) {
                return true;
            }
            else {
                validate.insert(num);
            }
        }

        return false;
    }
};