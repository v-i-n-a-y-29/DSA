import java.util.*;

public class BfsAndDfsTraversal
{
    // BFS traversal method
    public static void bfs(ArrayList<ArrayList<Integer>> adj, int start) {
        int vis[] = new int[adj.size()];
        vis[start] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        ArrayList<Integer> ans =new ArrayList<>();
        while(!q.isEmpty())
        {
            Integer node = q.poll();
            ans.add(node);
            for(Integer it:adj.get(node))
            {
                if(vis[it]==0)
                {
                    vis[it]=1;
                    q.add(it);
                }
            }
        }
        System.out.println(ans);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    
    static void dfs(ArrayList<ArrayList<Integer>> adj,int start,int vis[])
    {
        vis[start] = 1;
        list.add(start);
        for(Integer it:adj.get(start))
        {
            if(vis[it]==0)
            {
                dfs(adj,it,vis);
            }
        }
    }
    
    public static void main(String[] args) {
        // Create adjacency list for a graph with 7 nodes (0 to 6)
        int n = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Add edges to create a sample graph
        // Example graph:
        //       0
        //      / \
        //     1   2
        //    / \   \
        //   3   4   5
        //        \
        //         6
        
        // Add edges (undirected graph)
        adj.get(0).add(1);
        adj.get(0).add(2);
        
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(1).add(4);
        
        adj.get(2).add(0);
        adj.get(2).add(5);
        
        adj.get(3).add(1);
        
        adj.get(4).add(1);
        adj.get(4).add(6);
        
        adj.get(5).add(2);
        
        adj.get(6).add(4);
        
        // Print adjacency list
        System.out.println("Adjacency List:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Perform BFS starting from node 0
        bfs(adj, 0);
        int vis[] = new int[n];
        dfs(adj,0,vis);
        System.out.println("dfs of the graph is:"+list);

    }
}