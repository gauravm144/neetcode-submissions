class Tweet{
    int tweetId;
    int time;
    Tweet next;
    public Tweet(int tweetId,int time){
        this.tweetId=tweetId;
        this.time=time;
        this.next=null;
    }
}
class Twitter {
    Map<Integer,Set<Integer>> followmap=new HashMap<>();
    Map<Integer,Tweet> tweetmap=new HashMap<>();
    int count_as_time=0;
    public Twitter() {
    }
    
    public void postTweet(int userId, int tweetId) {
        Tweet tweet=new Tweet(tweetId,++count_as_time);
        Tweet t=tweetmap.get(userId);
        tweet.next=t;
        tweetmap.put(userId,tweet);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> q=new PriorityQueue<>((a,b)->b.time-a.time);
        int tot=10;
        Set<Integer> set=new HashSet<>(followmap.getOrDefault(userId, new HashSet<>()));
        set.add(userId);
        for(Integer s:set){
            Tweet t=tweetmap.get(s);
            if(t!=null)
            q.add(t);
        }
        List<Integer> ans=new ArrayList<>();
        while(tot>0&&!q.isEmpty()){
            Tweet t=q.poll();
            ans.add(t.tweetId);
            if(t.next!=null)
            q.add(t.next);
            tot--;
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        followmap.putIfAbsent(followerId,new HashSet<>());
        followmap.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        followmap.get(followerId).remove(followeeId);
    }
}
