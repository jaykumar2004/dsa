import java.util.ArrayList;

public class swap_two {
    public static void swap(ArrayList<Integer> item, int idx1, int idex2){
        int temp = item.get(idx1);
        item.set(idx1, item.get(idex2));
        item.set(idex2, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> item = new ArrayList<>();
        item.add(2);
        item.add(5);
        item.add(9);
        item.add(3);
        item.add(6);

        int idx1=1, idex2=3; 
        System.out.println(item);
        swap(item, idx1,idex2);
        System.out.println(item);
    }
}
