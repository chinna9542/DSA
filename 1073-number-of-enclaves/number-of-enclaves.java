class Solution {
    static void dfs(int i,int j,boolean vis[][],int grid[][]){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0||j<0||i>=m||j>=n||vis[i][j]||grid[i][j]==0) return;
        vis[i][j]=true;
        dfs(i-1,j,vis,grid);
        dfs(i+1,j,vis,grid);
        dfs(i,j-1,vis,grid);
        dfs(i,j+1,vis,grid);
    }
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<n;i++){
            if(grid[0][i]==1&&!vis[0][i]) dfs(0,i,vis,grid);
        }
        for(int i=0;i<m;i++){
            if(grid[i][n-1]==1&&!vis[i][n-1]) dfs(i,n-1,vis,grid);
        }
        for(int i=0;i<n;i++){
            if(grid[m-1][i]==1&&!vis[m-1][i]) dfs(m-1,i,vis,grid);
        }
        for(int i=0;i<m;i++){
            if(grid[i][0]==1&&!vis[i][0]) dfs(i,0,vis,grid);
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1&&!vis[i][j]) count++;
            }
        }
        return count;
    }
}