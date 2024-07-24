//using data types(fun overloading)
public class fun_over {
    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3.5f,4.1f));
        System.out.println(sum(2,4));
        
    }
}
