import java.util.*;
public class maximum {
    public static void main(String[] args) {
        ArrayList<Integer> item = new ArrayList<>();
        item.add(2);
        item.add(5);
        item.add(9);
        item.add(3);
        item.add(6);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<item.size();i++){
            // if(max<item.get(i)){
            //     max = item.get(i);
            // }

            //or

            max = Math.max(max, item.get(i));
        }
        System.out.println("maximum = " + max);
    }
}
