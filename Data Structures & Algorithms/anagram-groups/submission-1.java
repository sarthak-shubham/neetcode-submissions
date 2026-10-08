class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map = new HashMap<>();

        for(String str : strs) {

            List<Integer> nums = new ArrayList<>();
            for(int i = 0; i < 26; i++) {
                nums.add(0);
            }

            for (char c : str.toCharArray()) {
                int n = c - 'a';
                nums.set(n, nums.get(n) + 1);
            }

            if ( map.containsKey(nums)) {
                map.get(nums).add(str);
            }
            else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(nums, strList);
            }
        }

        List<List<String>> results = new ArrayList<>();
        for (List<String> candidates : map.values()) {
            results.add(candidates);
        }

        return results;
    }
}
