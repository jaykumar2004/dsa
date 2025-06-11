package n_queens;

public class one_queen {

    public static void nQueens(char board[][], int row){
        //base case:
        if(row == board.length){
            printBoard(board);
            return;
        }


        //column loop
        for(int j=0;j<board.length;j++){
            board[row][j] = 'Q'; //placing the queen in the board
            nQueens(board, row+1); //function call
            board[row][j] = 'X'; //backtracking step
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
        int n=2;
        char board[][] = new char[n][n];
        //initialize:
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X'; //no queen
            }
        }
        nQueens(board,0);
    }

    /*
     output:
Chess Board 
Q X
Q X
Chess Board 
Q X
X Q
Chess Board
X Q
Q X
Chess Board
X Q
X Q
     */
}
