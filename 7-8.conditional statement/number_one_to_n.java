import java.util.*;
public class number_one_to_n{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ernter the range:");
    
    int range=sc.nextInt();
    int counter = 1;
    System.out.println("the numbers are:");
    
    while(counter<=range){
        System.out.print(counter+" ");
        counter++;
    }
    System.out.println();
}
    
}