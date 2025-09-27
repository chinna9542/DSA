class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, odd = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            if (num % 2 == 1) odd++;
            if (map.containsKey(odd - k)) {
                count += map.get(odd - k);
            }
            map.put(odd, map.getOrDefault(odd, 0) + 1);
        }
        return count;
    }
}
