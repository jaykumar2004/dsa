// prime number using functions
public class prime {
    public static boolean isone(int n){
        boolean isone=true;
        for(int i=1;i<=n-1;i++){
            if(n%i==0){//completely divide
                isone=false;
                break;
            }
        }
        return isone;
    }
    public static void main(String[] args) {
        System.out.println(isone((5)));
    }
}
