public class LargestInArray {

    public static void printLargest(int[] numbers, int key) {
        System.out.println("Numbers array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nKey: " + key);
    }

    public static void main(String[] args) {
        System.out.println("Hello, this is your captain Jay.");
        int[] numbers = {2, 4, 6, 8, 20};
        int key = 20;
        printLargest(numbers, key);
    }
}
