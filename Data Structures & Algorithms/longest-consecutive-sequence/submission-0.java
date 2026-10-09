class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for(int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 0;

                while(set.contains(current)) {
                    current++;
                    length++;
                }

                if ( length > maxLength) {
                    maxLength = length;
                }
            }

        }
        
        return maxLength;
    }
}
