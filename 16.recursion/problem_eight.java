public class problem_eight {
    //last occurence in array
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        //Look Forward and check with self:
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;

    }
    public static void main(String[] args) {
        int arr [] = {8,3,6,9,5,10,2,5,3};
        System.out.println("key found at index:" + lastOccurence(arr, 5, 0));

    }
}