class Point {
    int x, y;
    double area;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.area = Math.sqrt((long)x * x + (long)y * y);
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Max-Heap: keeps the largest distances at the top to prune them
        PriorityQueue<Point> q = new PriorityQueue<>((a, b) -> Double.compare(b.area, a.area));

        for (int i = 0; i < points.length; i++) {
            Point p = new Point(points[i][0], points[i][1]);
            if (q.size() < k) {
                q.add(p);
            } else if (p.area < q.peek().area) {
                q.poll();
                q.add(p);
            }
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            Point p = q.poll();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }
        return ans;
    }
}
