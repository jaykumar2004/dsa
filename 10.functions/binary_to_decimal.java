//binary to decimal
public class binary_to_decimal {
    public static void binTodec(int BinNum){
        int myNum=BinNum;
        int pow=0;
        int decNum=0;
        while(BinNum > 0){
            int lastDigit=BinNum % 10;//for last digit we need to divide the number by 10
            decNum=decNum+(lastDigit * (int)Math.pow(2,pow));
            pow++;
            BinNum=BinNum/10;
        }
        System.out.println("deciaml of:"+ myNum+"="+decNum);
    }

    public static void main(String[] args) {
        binTodec(101);
    }
}
