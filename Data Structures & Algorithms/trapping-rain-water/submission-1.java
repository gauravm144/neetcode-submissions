class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int left_grt=height[0];
        for(int i=1;i<n;i++){
            if(height[i]>=left_grt)
            left[i]=0;
            else
            left[i]=left_grt;
            left_grt=Math.max(left_grt,height[i]);
        }
        int right[]=new int[n];
        int right_grt=height[n-1];
        for(int i=n-2;i>=0;i--){
            if(height[i]>=right_grt)
            right[i]=0;
            else
            right[i]=right_grt;

            right_grt=Math.max(right_grt,height[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int max_fill=Math.min(left[i],right[i])-height[i];
            if(max_fill>=0)
            ans+=max_fill;
            System.out.println(i+1+"\t"+left[i]+"\t"+right[i]+"\t"+max_fill);
        }
        return ans;
    }
}
