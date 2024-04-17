class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> all = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int i = 0; i < nums2.length; i++)
            all.add(nums2[i]);

        for(int i = 0; i < nums1.length; i++){
            if(all.contains(nums1[i]))
                result.add(nums1[i]);
        }
        int[] res = new int[result.size()];
        int index = 0;
        for(int num : result)
            res[index++] = num;
        return res;
    }
}