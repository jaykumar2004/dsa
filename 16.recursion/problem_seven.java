public class problem_seven {
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){ //if the key is found on the first index
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr [] = {8,3,6,9,5,10,2,5,3};
        System.out.println("key found at index: " + firstOccurence(arr, 5, 0)); 
    }
}
