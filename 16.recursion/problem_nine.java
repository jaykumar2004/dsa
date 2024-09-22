public class problem_nine {
    public static int power(int x, int n){
        if(n == 0){
            return 1;

        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1); //single statement code

    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
