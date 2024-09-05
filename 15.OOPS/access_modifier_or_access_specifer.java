public class access_modifier_or_access_specifer {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "jaykumar";
        myAcc.setPassword("jaykumar");
    }
    

}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
