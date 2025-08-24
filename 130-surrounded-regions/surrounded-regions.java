class Solution {
    static void dfs(int i,int j,boolean vis[][],char board[][]){
        int m=board.length;
        int n=board[0].length;
        if(i<0||j<0||i>=m||j>=n||board[i][j]=='X'||vis[i][j]) return;
        vis[i][j]=true;
        dfs(i-1,j,vis,board);
        dfs(i+1,j,vis,board);
        dfs(i,j-1,vis,board);
        dfs(i,j+1,vis,board);
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<n;i++){
            if(board[0][i]=='O'){
                if(!vis[0][i]) dfs(0,i,vis,board);
            } 
        }
        for(int i=0;i<m;i++){
            if(board[i][n-1]=='O'){
                if(!vis[i][n-1]) dfs(i,n-1,vis,board);
            }
        }
        for(int i=0;i<n;i++){
            if(board[m-1][i]=='O'){
                if(!vis[m-1][i]) dfs(m-1,i,vis,board);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                if(!vis[i][0]) dfs(i,0,vis,board);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    if(!vis[i][j]) board[i][j]='X';
                }
            }
        }
    }
}