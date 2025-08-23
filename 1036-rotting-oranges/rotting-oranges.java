class Solution {
    class pair{
        int row;
        int col;
        int tm;
        pair(int row,int col,int tm){
            this.row=row;
            this.col=col;
            this.tm=tm;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        Queue<pair> q=new LinkedList<>();
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new pair(i,j,0));
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) cnt++;
            }
        }
        int cn=0;
        int a[]={-1,0,+1,0};
        int b[]={0,+1,0,-1};
        int t=0;
        while(!q.isEmpty()){
            pair cur=q.poll();
            int r=cur.row;
            int c=cur.col;
            int tm=cur.tm;
            t=Math.max(t,tm);
            for(int i=0;i<4;i++){
                int nr=r+a[i];
                int nc=c+b[i];
                if(nr>=0&&nr<m&&nc>=0&&nc<n&&vis[nr][nc]==0&&grid[nr][nc]==1){
                    q.add(new pair(nr,nc,tm+1));
                    vis[nr][nc]=2;
                    cn++;
                }
            }
        }
        if(cn!=cnt) return -1;
        return t;
    }
}