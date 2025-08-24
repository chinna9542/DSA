class Solution {
    public boolean isBipartite(int[][] graph) {
        int v=graph.length;
        int col[]=new int[v];
        Arrays.fill(col,-1);
        for(int i=0;i<v;i++){
            if(col[i]==-1){
                Queue<Integer> q=new LinkedList<>();
                col[i]=0;
                q.add(i);
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int nei:graph[node]){
                        if(col[nei]==-1){
                            col[nei]=1-col[node];
                            q.add(nei);
                        }else if(col[node]==col[nei]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}


// class Solution {
//     static boolean dfs(int i,int colour,int col[],int graph[][]){
//         col[i]=colour;
//         for(int j=0;j<graph[i].length;j++){
//             if(col[graph[i][j]]==-1){
//                 dfs(graph[i][j],1-colour,col,graph);
//             }else if(col[graph[i][j]]==colour){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public boolean isBipartite(int[][] graph) {
//         int v=graph.length;
//         int col[]=new int[v];
//         Arrays.fill(col,-1);
//         for(int i=0;i<v;i++){
//             if(col[i]==-1){
//                 if(dfs(i,0,col,graph)==false) return false;
//             }
//         }
//         return true;
//     }
// }