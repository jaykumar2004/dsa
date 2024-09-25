public class problem_thirteen {
    //friends paring problem:
    public static int friendsParing(int n){
        //base case:
        if(n ==1 || n ==2){
            return n;
        }

        // //kaam: choice: single
        // int fnm1 = friendsParing(n-1);

        // //pair:
        // int fnm2 = friendsParing(n-2);
        // int pairWays = (n-1) * fnm2;
        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        return friendsParing(n-1) + (n-1) * friendsParing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsParing(3));
    }
}
