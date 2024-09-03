public class diagonal_sum {

    public static int getSum(int matrix[][]){
        int sum =0;

    //for primary diagonal //this is not an optimized solution because the TC of this code is o(n^2)
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(i == j){
    //                 sum += matrix[i][j];
    //             }
    //             else if(i+j == matrix.length-1){
    //                 sum += matrix[i][j];
    //             }
    //         }
    //     }

    for(int i=0;i<matrix.length;i++){
        //primary diagonal sum
        sum += matrix[i][i];

        //secondary diagonal sum
        if(i != matrix.length-i-1){
            sum += matrix[i][matrix.length-i-1];
        }
    }
    //now the TC = o(n)

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
            System.out.println(getSum(matrix));
    }
}
