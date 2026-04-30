public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = new HashSet<>();
        Set<Integer> num2Set = new HashSet<>();
        for (int num : nums1) num1Set.add(num);
        for (int num : nums2) num2Set.add(num);

        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        for (int num : num1Set) {
            if (!num2Set.contains(num)) res1.add(num);
        }

        for (int num : num2Set) {
            if (!num1Set.contains(num)) res2.add(num);
        }

        return Arrays.asList(res1, res2);
    }
}