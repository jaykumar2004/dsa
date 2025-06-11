public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch); //append use keya he string ke pichey jodney ke leye

        }
        System.out.println(sb); //abcdefghijklmnopqrstuvwxyz
        //TC = O(26)
        System.out.println("length is: " + sb.length());
    }
}
