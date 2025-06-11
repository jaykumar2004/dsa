import java.util.Scanner;

public class creation_of_2d_array {


    public static boolean search(int matrix[][], int key){
        //to search element int the matrix
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell (" + i +","+ j + ")");
                    return true;
                }  
            }
        }
        System.out.println("Key Not Found");
        return false;
    }



    public static void main(String[] args) {
        int matrix [][] = new int [3][3]; //creation of 2d array

        // int n=3, m=2;
        //another way to calculate the n and m
        //here n=rows, and m = columns
        int n=matrix.length, m=matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt(); //to access the matrix

            }
        }
        //output
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
    }
}


//question : To find the largest and smallest in the matrix