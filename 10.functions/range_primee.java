//print all prime numbers in range
public class range_primee {
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


        public static void primeinrange(int n){
            for(int i=2;i<=n;i++){
                if(abc(i)){//true
                    System.out.println(i + " ");
                }
            }
            System.out.println();
        }
        public static void main(String[] args) {
            primeinrange(100);
        }
    }

