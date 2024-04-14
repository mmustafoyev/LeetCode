class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Add elements of nums1 to set
        for (int num : nums1) {
            set.add(num);
        }

        // Check if each element of nums2 exists in the set
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert resultSet to array
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }
}