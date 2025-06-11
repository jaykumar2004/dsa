public class max_subarray_sum_bruteforce {

    public static void maxSubarraysSum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                currSum = 0;
                for (int k=start; k<=end;k++){ //isko sirf print karena he
                    //sub array ka sum niklenge
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }   
        }
        System.out.println("max sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3};
        maxSubarraysSum(numbers);
    }
}
