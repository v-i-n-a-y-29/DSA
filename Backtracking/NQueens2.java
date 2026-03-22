package Backtracking;

import java.util.ArrayList;

public class NQueens2 {
    public int totalNQueens(int n) {
        ArrayList<char[][]> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = '.';
            }
        }

        solve(ans,board,0,n);
        return ans.size();

    }
    void solve(ArrayList<char[][]> ans,char[][] board,int row,int n){

        if(row>=n){
            ans.add(board);
            return;
        }

        for(int col=0;col<n;col++){
            if(isValid(board,row,col)){
                board[row][col]='Q';
                solve(ans, board, row+1, n);
                board[row][col]='.';
            }
        }
    }
    static boolean isValid(char[][] board,int row,int col)
    {
        int n = board.length;

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        NQueens2 solver = new NQueens2();
        int n = 1;
        System.out.println(solver.totalNQueens(n));
    }
}
