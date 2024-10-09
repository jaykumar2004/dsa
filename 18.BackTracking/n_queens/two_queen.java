package n_queens;

public class two_queen {

    public static boolean isSafe(char board[][], int row, int col){
        //vertical up:
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonal up:
        for(int i=row-1, j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }


        //diagonal right up:
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }   
        }
        return true;

    }

    public static void nQueens(char board[][], int row){
        //base case:
        if(row == board.length){
            printBoard(board);
            return;
        }


        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q'; //placing the queen in the board
                nQueens(board, row+1); //function call
                board[row][j] = 'X'; //backtracking step
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("Chess Board ");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    } 


    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        //initialize:
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X'; //no queen
            }
        }
        nQueens(board,0);
    }
}
/*
 Output:
 Chess Board 
X Q X X
X X X Q
Q X X X
X X Q X
Chess Board
X X Q X
Q X X X
X X X Q
X Q X X
 */