class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        int j=0;
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                nums1[j]=nums2[i];
                j++;
                set.remove(nums2[i]);
            }
        }
        int[] ans=new int[j];
        for(int i=0;i<j;i++)
        ans[i]=nums1[i];
        
        return ans;

    }
}