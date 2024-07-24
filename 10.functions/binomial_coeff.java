public class binomial_coeff {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }


    public static int binomial_coefficient(int n, int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);

        int binomial_coefficient=n_fact/(r_fact*nmr_fact);
        return binomial_coefficient;
    }
    public static void main(String[] args) {
       System.out.println(binomial_coefficient(5, 2)); 
    }
}
