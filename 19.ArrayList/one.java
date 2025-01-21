import java.util.*;
public class one{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i=list.size()-1;i>=0;i++){
            System.out.println(list.get(i));
        }

        // add element O(1)
        // System.out.println(list);

        //add an element directly at the index:
        // list.add(1,9);
        // System.out.println(list);

        //get Element O(1)
        // int element = list.get(2);
        // System.out.println(element);

        //remove element O(n)
        // list.remove(2);
        // System.out.println(list);

        //set element at index O(n)
        // list.set(2, 10);
        // System.out.println(list);

        // //contains element
        // System.out.println(list.contains(11));
        // System.out.println(list.size());

        //print the array list
    //     for(int i=0;i<list.size();i++){
    //         System.out.print(list.get(i)+" ");
    //     }
    //     System.out.println();
    // }
}
}