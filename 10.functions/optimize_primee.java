//optimize code to calculate prime number
public class optimize_primee {
    public static boolean abc(int n){
        if(n==2){
            return true;
        }
        for(int i = 2 ; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        }
        public static void main(String[] args) {
            System.out.println(abc(2));
        }
    }
