class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        s1.add(nums1[i]);

        Set<Integer> s2=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
        s2.add(nums2[i]);
        
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for(int i=0;i<nums2.length;i++){
            if(s1.contains(nums2[i])){
                s1.remove(nums2[i]);
            }
        }
        for(int i=0;i<nums1.length;i++){
            if(s2.contains(nums1[i])){
                s2.remove(nums1[i]);
            }
        }
        for(Integer s:s1){
            ans.get(0).add(s);
        }
        for(Integer s:s2){
            ans.get(1).add(s);
        }
        return ans;
    }
}