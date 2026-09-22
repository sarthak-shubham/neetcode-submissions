class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<pair<int, int>> count;

        for(int i = 0; i < nums.size(); i++) {
            count.push_back({nums[i], i});
        }

        sort(count.begin(), count.end());

        int start = 0;
        int end = nums.size() - 1;

        while(start < end) {

            if (count[start].first + count[end].first == target) {
                int a = count[start].second;
                int b = count[end].second;
                return {min(a,b), max(a,b)};
            }

            else if (count[start].first + count[end].first > target) {
                end--;
            }

            else {
                start++;
            }
        }

        return {};
    }
};
