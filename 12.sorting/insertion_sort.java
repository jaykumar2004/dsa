public class insertion_sort {

    public static void sort(int arr[]){
        for (int i = 1; i < arr.length; i++){
            int curr = arr[i]; // store the current element
            int prev = i - 1;

            // find the correct position to insert the current element
            while (prev >= 0 && arr[prev] > curr) { //change the > to < to get the answer in descending order
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insert the current element
            arr[prev + 1] = curr;
        }
    }

    public static void print_Arr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        sort(arr);
        print_Arr(arr);
    }
}
