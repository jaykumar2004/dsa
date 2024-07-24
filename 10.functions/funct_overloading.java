//sum of a b and c using function overloading
public class funct_overloading {
    public static int sum(int a, int b){//for two numbers
        return a+b;
    }
    

    public static int sum(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(3,4,5));
    }

}
