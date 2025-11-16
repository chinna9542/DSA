class Solution {
    static class Pair{
        int stops;
        int node;
        int d;
        Pair(int stops, int node, int d){
            this.stops = stops;
            this.node = node;
            this.d = d;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for(int i = 0; i < flights.length; i++) {
            int s = flights[i][0];
            int d = flights[i][1];
            int cost = flights[i][2];
            adj.get(s).add(new Pair(0, d, cost));  // stops=0 in adjacency
        }

        int[] dis = new int[n];
        Arrays.fill(dis, (int)1e9);
        dis[src] = 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, src, 0));

        while(!q.isEmpty()) {
            Pair cur = q.poll();
            int stops = cur.stops;
            int node = cur.node;
            int costSoFar = cur.d;

            if(stops > k) continue;  // cannot exceed allowed stops

            for(Pair nei : adj.get(node)) {
                int nextNode = nei.node;
                int nextCost = nei.d;

                if(costSoFar + nextCost < dis[nextNode]) {
                    dis[nextNode] = costSoFar + nextCost;
                    q.add(new Pair(stops + 1, nextNode, dis[nextNode]));
                }
            }
        }

        return dis[dst] == (int)1e9 ? -1 : dis[dst];
    }
}
