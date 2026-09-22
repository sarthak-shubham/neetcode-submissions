class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) {
            return false;
        }

        unordered_map<char, int> order;

        for (int i = 0; i < s.length(); i++) {
            order[s[i]]++;
            order[t[i]]--;
        }

        for (int i = 0; i < s.length(); i++) {
            char temp = s[i];
            if (order[temp] != 0) {
                return false;
            }
        }

        return true;
    }
};
