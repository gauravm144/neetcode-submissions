class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0,right=arr.length-1;
        while(right-left>=k){
            if(Math.abs(arr[right]-x)<Math.abs(arr[left]-x))
            left++;
            else
            right--;
        }
        List<Integer> ans=new ArrayList<>();
        while(left<=right){
            ans.add(arr[left]);
            left++;
        }
        return ans;
    }
}