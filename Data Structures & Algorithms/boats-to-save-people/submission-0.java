class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1;
        int ans=0;
        while(i<=j){
            if(i==j)
            {
                ans++;
                i++;
                j--;
            }
            else if(people[j]==limit||people[j]+people[i]>limit){
                j--;
                ans++;
            }
            else{
                ans++;
                i++;
                j--;
            }
        }
        return ans;
    }
}