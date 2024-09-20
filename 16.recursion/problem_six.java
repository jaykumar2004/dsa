public class problem_six {
    public static boolean isSorted(int arr[], int i){

        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1}; //if the array is sorted so it will print true, if not so it will print false
        System.out.println(isSorted(arr, 0));

    }
}
