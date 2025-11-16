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
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==1||grid[m-1][n-1]==1) return -1;
        if(m==1&&n==1&&grid[0][0]==0) return 1;
        int dist[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=(int) (1e9);
            }
        }
        Queue<Pair> q=new LinkedList<>();
        dist[0][0]=1;
        q.add(new Pair(1,0,0));
        int dr[]={0, 1, 1, 1, 0, -1, -1, -1};
        int dc[]={1, 1, 0, -1, -1, -1, 0, 1};
        while(!q.isEmpty()){
            Pair cur=q.peek();
            q.remove();
            int d=cur.d;
            int r=cur.r;
            int c=cur.c;
            for(int i=0;i<8;i++){
                int cr=r+dr[i];
                int cc=c+dc[i];
                if(cr>=0&&cr<m&&cc>=0&&cc<n&&grid[cr][cc]==0&&d+1<dist[cr][cc]){
                    dist[cr][cc]=1+d;
                    if(cr==m-1&&cc==n-1) return d+1;
                    q.add(new Pair(1+d,cr,cc));
                }
            }
        }
    return -1;
    }
}