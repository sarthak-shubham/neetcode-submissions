class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) {
            return false;
        }
        unordered_map<char, int> sh;
        unordered_map<char, int> th;

        for (int i = 0; i < s.length(); i++) {
            sh[s[i]]++;
            th[t[i]]++;
        }

        for ( int i = 0; i < s.length(); i++) {
            char temp = s[i];
            if (th.count(temp) == 0) {
                return false;
            }
            else if (sh[temp] != th[temp]) {
                return false;
            }
        }

        return true;
    }
};
