public class palindrome {

    public static boolean getPalinromeNumber(String str){
        for(int i = 0; i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) { 
        String str = "car";
        System.out.println(getPalinromeNumber(str));
    }
}

//TimeComplexity=O(n)
