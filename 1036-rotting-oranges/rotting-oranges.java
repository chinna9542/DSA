class Solution {
    static class Pair{
        int row;
        int col;
        int tm;
        Pair(int row,int col,int tm){
            this.row=row;
            this.col=col;
            this.tm=tm;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        int fresh=0;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) fresh++;
            }
        }
        int rottenCount=0;
        int a[]={-1,0,+1,0};
        int b[]={0,+1,0,-1};
        int time=0;
        while(!q.isEmpty()){
            Pair cur=q.poll();
            int r=cur.row;
            int c=cur.col;
            int tm=cur.tm;
            time=Math.max(time,tm);
            for(int i=0;i<4;i++){
                int currow=r+a[i];
                int curcol=c+b[i];
                if(currow>=0&&currow<m&&curcol>=0&&curcol<n&&vis[currow][curcol]==0&&grid[currow][curcol]==1){
                    q.add(new Pair(currow,curcol,tm+1));
                    vis[currow][curcol]=2;
                    rottenCount++;
                }
            }
        }
        if(fresh!=rottenCount) return -1;
        else return time;
    }
}