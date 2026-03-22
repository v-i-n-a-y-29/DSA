import java.util.*;

public class ValidSudoku {

    boolean validate(char[][] board,int sr,int sc,int er,int ec)
    {
        Set<Character> set=new HashSet<>();
        for(int i=sr;i<=er;i++)
        {
            for(int j=sc;j<=ec;j++)
            {
                if(board[i][j]=='.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        // check duplicates for row
        
        for(int i=0;i<9;i++)
        {
            Set<Character> rowSet=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.') continue;
                if(rowSet.contains(board[i][j])) return false;
                rowSet.add(board[i][j]);
            }
        }
        // check duplicates for column
       
        for(int i=0;i<9;i++)
        {
             Set<Character> colSet=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[j][i]=='.') continue;
                if(colSet.contains(board[j][i])) return false;
                colSet.add(board[j][i]);
            }
        }

        // check for each 3*3 box
        Set<Character> boxSet  = new HashSet<>();
        for(int sr=0;sr<9;sr+=3)
        {
            int er=sr+2;
            for(int sc=0;sc<9;sc+=3)
            {
                int ec=sc+2;
                // validate the box (sr,sc,er,ec)
                if(!validate(board,sr,sc,er,ec))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
