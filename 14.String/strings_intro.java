import java.util.*;

public class strings_intro {

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");//to print all letters in the string
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        // //string are IMMUTABLE

        // //input and output

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine(); //in next function it takes only single words, so we use nextLine function
        // System.out.println(name);

        //length of the strings
        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        //Concatenation
        String firstName = "Jay";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;

        // System.out.println(fullName.charAt(0));
        printLetters(fullName);

    }
}