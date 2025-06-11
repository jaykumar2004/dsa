public class array {
    //back tracing on array

    public static void changeArr(int arr[], int i, int val){
        //base case:
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //recursion (kaam):
        arr[i] = val;
        changeArr(arr, i+1, val+1); //first print the values in array from 1 to 5 (fnx call step)
        arr[i] = arr[i] - 2; //decresing the value of the array by 2 (backtracing step)
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
        
    }
}
