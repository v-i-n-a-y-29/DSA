package Backtracking;

import java.util.ArrayList;

public class RatInAMaze {
    public static ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int n=maze.length;
        boolean visited[][]=new boolean[n][n];
        solve(0,0,ans,maze,visited,"");
        return ans;
        
    }
    public static void solve(int r,int c,ArrayList<String> ans,int[][] maze,boolean visited[][],String path)
    {
        int n=maze.length;
        if(r==n-1&&c==n-1){
            ans.add(path);
            return;
        }
        if(r<0 || r>n-1 || c<0 || c>n-1 || maze[r][c]==0 || visited[r][c]==true){
            return;
        }
        visited[r][c]=true;

        solve(r+1, c, ans, maze, visited, path+'D'); //down
        solve(r, c-1, ans, maze, visited, path+'L');//left
        solve(r, c+1, ans, maze, visited, path+'R');//right
        solve(r-1, c, ans, maze, visited, path+'U');//up

        visited[r][c]=false;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 0, 0, 0},
            {1, 1, 1, 1}
        };
        ArrayList<String> paths = ratInMaze(maze);
        if (paths.isEmpty()) {
            System.out.println("No path found");
        } else {
            System.out.println("Paths found:");
            for (String path : paths) {
                System.out.println(path);
            }
        }
    }


}
