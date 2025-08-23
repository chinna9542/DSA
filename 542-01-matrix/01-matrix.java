class Solution {
    class pair{
        int row;
        int col;
        int steps;
        pair(int row,int col,int steps){
            this.row=row;
            this.col=col;
            this.steps=steps;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int vis[][]=new int[m][n];
        int dis[][]=new int[m][n];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new pair(i,j,0));
                    vis[i][j]=1;
                }
                else vis[i][j]=0;
            }
        }
        int a[]={-1,0,+1,0};
        int b[]={0,+1,0,-1};
        while(!q.isEmpty()){
            pair cur=q.poll();
            int r=cur.row;
            int c=cur.col;
            int s=cur.steps;
            dis[r][c]=s;
            for(int i=0;i<4;i++){
                int rn=r+a[i];
                int cn=c+b[i];
                if(rn>=0&&cn>=0&&rn<m&&cn<n&&vis[rn][cn]==0){
                    vis[rn][cn]=1;
                    q.add(new pair(rn,cn,s+1));
                }
            }
        }
        return dis;
    }
}