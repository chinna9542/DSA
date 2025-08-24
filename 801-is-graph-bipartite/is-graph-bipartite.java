class Solution {
    static boolean dfs(int i,int colour,int col[],int graph[][]){
        col[i]=colour;
        for(int j=0;j<graph[i].length;j++){
            if(col[graph[i][j]]==-1){
                if(!dfs(graph[i][j],1-colour,col,graph)) return false;
            }else if(col[graph[i][j]]==colour){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int v=graph.length;
        int col[]=new int[v];
        Arrays.fill(col,-1);
        for(int i=0;i<v;i++){
            if(col[i]==-1){
                if(dfs(i,0,col,graph)==false) return false;
            }
        }
        return true;
    }
}