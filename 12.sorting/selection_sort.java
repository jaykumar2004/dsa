public class selection_sort {
    public static void sort(int array []){
        for (int i = 0; i < array.length-1; i++) {
            int minPosition = i; //minPosition = current position
            for (int j = i+1; j < array.length; j++) {   
                //for making it reverse sort just change the below inequlaties
                // < , >
                if (array[minPosition] > array[j]) {
                    minPosition = j;                   
                }
            }

            //swap
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }

    public static void print_Arr(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        sort(arr);
        print_Arr(arr);
        
    }
    
}
