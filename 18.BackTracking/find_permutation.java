public class find_permutation {

    public static void findPerm(String str, String ans){
        //base case:
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //resursion:
        //first we take choices:
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i); //curr is current character
            //"abcde"=>"ab"+"de" = "abde" , removing "c"
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPerm(Newstr, ans+curr);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPerm(str, "");
    }
}
