import java.util.*;
public class input_output_in_arrays {
    public static void main(String[] args) {
        //input and output

        int marks[]= new int[100];

        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy=sc.nextInt();
        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//maths
        System.out.println("phy"+marks[0]);
        System.out.println("chem"+marks[1]);
        System.out.println("maths"+marks[2]);
    }
}
