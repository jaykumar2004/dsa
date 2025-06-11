public class Array {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }



    //linear search
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }


    //largest number
    public static void int(int numbers)


    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("KEY IS AT INDEX: " + index);
        }


    }
//        int marks[] = {97,98,99};
//        update(marks);
//
//        //print the marks
//        for(int i=0;i<marks.length;i++){
//            System.out.print(marks[i]+" ");
//        }
//        System.out.println();
//    }
}