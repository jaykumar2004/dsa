public class kadnes_algo {


    public static void kadnes(int number[]) {
        int ms = Integer.MIN_VALUE; //maximum sum
        int cs = 0; //current sum

        for (int i=0; i<number.length;i++){
            cs = cs+number[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max sum is :" + ms);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadnes(numbers);
    }
}
