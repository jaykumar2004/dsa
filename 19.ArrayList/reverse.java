import java.util.*;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> item = new ArrayList<>();
        item.add(1);
        item.add(2);
        item.add(3);
        item.add(4);
        item.add(5);

        for(int i=item.size()-1;i>=0;i--){
            System.out.print(item.get(i)+" ");
        }
        System.out.println();
    }
}
