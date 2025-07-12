class Solution {
    static List<Integer> row(int n){
        int ans=1;
        List<Integer> l=new ArrayList<>();
        l.add(ans);
        for(int i=1;i<=n;i++){
            ans=ans*(n-i+1)/i;
            l.add(ans);
        }
        
        return l;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            l.add(row(i));
        }
        return l;
    }
}