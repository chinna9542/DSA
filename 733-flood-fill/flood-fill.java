class Solution {
    static void dfs(int r,int c,int image[][],int oc,int nc){
        if(r<0||c<0||r>=image.length||c>=image[0].length) return;
        if(image[r][c]!=oc) return;
        image[r][c]=nc;
        dfs(r-1,c,image,oc,nc);
        dfs(r+1,c,image,oc,nc);
        dfs(r,c-1,image,oc,nc);
        dfs(r,c+1,image,oc,nc);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc=image[sr][sc];
        if(oc!=color) dfs(sr,sc,image,oc,color);
        return image;
    }
}


// class Solution {
//     class pair{
//         int row;
//         int col;
//         pair(int row,int col){
//             this.row=row;
//             this.col=col;
//         }
//     }
//     public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//         int m=image.length;
//         int n=image[0].length;
//         int oc=image[sr][sc];//originsl colour
//         if(oc==color) return image;
//         image[sr][sc]=color;
//         Queue<pair> q=new LinkedList<>();
//         q.add(new pair(sr,sc));
//         int dr[]={-1,0,+1,0};
//         int dc[]={0,+1,0,-1};
//         while(!q.isEmpty()){
//             pair cur=q.poll();
//             int r=cur.row;
//             int c=cur.col;
//             for(int i=0;i<4;i++){
//                 int pr=r+dr[i];
//                 int pc=c+dc[i];
//                 if(pr>=0&&pc>=0&&pr<m&&pc<n&&image[pr][pc]==oc){
//                     image[pr][pc]=color;
//                     q.add(new pair(pr,pc));
//                 }
//             }
//         }
//         return image;
//     }
// }