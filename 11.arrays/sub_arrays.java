public class sub_arrays {

    public static void printSubarrays(int number[]){
        int ts = 0; //total subarray ko print karaney ke leye
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                for (int k=start; k<=end;k++){ //isko sirf print karena he
                    System.out.print(number[k] + " "); //yea he subarray
                }
                ts++;
                System.out.println();
            }
            
        }
        System.out.println("total subarrays are: " + ts);
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10};
        printSubarrays(numbers);
    }
}
