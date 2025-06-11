import java.util.*;
public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> item = new ArrayList<>();
        item.add(2);
        item.add(5);
        item.add(9);
        item.add(3);
        item.add(6);
        System.out.println(item);

        Collections.sort(item); //sort in ascending order
        System.out.println(item);

        //descending order
        Collections.sort(item, Collections.reverseOrder());
        System.out.println(item);
    }
}
