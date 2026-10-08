class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> topK = new ArrayList<>();
        for(int candidate : map.keySet()) {
            int freq = map.get(candidate);
            topK.add(Map.entry(candidate, freq));
        }

        topK.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int[] results = new int[k];
        for(int i = 0; i<k; i++) {
            results[i] = topK.get(i).getKey();
        }

        return results;
    } 
}
