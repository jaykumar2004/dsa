/*you can import java.util.*;
or you can also import 
  java.util.Arrays;
*/

import java.util.*;

public class inbuilt_sort_in_java {

  public static void main(String[] args) {

    int arr[] = { 5, 3, 2, 1, 4 };

    Arrays.sort(arr);

    System.out.println("Inbuilt sort full soritng :");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }


    int arr2 [] = {5,4,3,2,1};

    System.out.println();

    Arrays.sort(arr2,0,3);

    System.out.println("Inbuilt sort of a specific range :");

    for (int i = 0; i < arr2.length; i++) {

      System.out.print(arr2[i]);
      
    }

  }

}

//to print the array in descending order we can use

//Integer arr[] = {5,4,1,3,2};
//Arrays.sort(arr, Collections.reverseOrder());
//Sout(arr); //5,4,3,2,1

//and for same we use it for index
//Arrays.sort(arr, 0, 3, Collections.reverseOrder());
//Sout(arr); //5,4,1,3,2

//whenever the sorting takes places we use "comparitor" or "compare"
// public static int compare(int a, int b){
//     //a < b => -ve
//     //a == b => 0
//     //a > b => +ve

//     return a-b;
// }
