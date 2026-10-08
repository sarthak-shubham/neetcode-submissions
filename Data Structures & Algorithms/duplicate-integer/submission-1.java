class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> store = new HashMap<>();

        for(int num: nums) {
            if(store.containsKey(num)) {
                return true;
            }
            else {
                store.put(num, 1);
            }
        }

        return false;
    }
}