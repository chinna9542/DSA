class Solution {
    static class Pair{
        int d;
        int r;
        int c;
        Pair(int d,int r,int c){
            this.d=d;
            this.r=r;
            this.c=c;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int dis[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dis[i][j]=(int) (1e9);
            }
        }
        dis[0][0]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.d-b.d);
        pq.add(new Pair(0,0,0));
        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, 1, 0, -1};
        while(!pq.isEmpty()){
            Pair cur=pq.peek();
            pq.remove();
            int d=cur.d;
            int r=cur.r;
            int c=cur.c;
            if(r==m-1&&c==n-1) return d;
            for(int i=0;i<4;i++){
                int cr=r+dr[i];
                int cc=c+dc[i];
                if(cr >= 0 && cr < m && cc >= 0 && cc < n){
                    int effort = Math.abs(heights[r][c] - heights[cr][cc]);
                    int maxEffort = Math.max(d, effort);
                    if(maxEffort < dis[cr][cc]){
                        dis[cr][cc] = maxEffort;
                        pq.add(new Pair(maxEffort, cr, cc));
                    }
                }
            }
        }
        return 0;
    }
}