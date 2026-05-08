public class User {
    String userName;
    String userId;
    Account[] accounts;
    User(String name, String id, int size){
        this.userName= name;
        this.userId= id;
        this.accounts= new Account[size];
    }
    User(){};
    void showAccount(){
            for (int i = 0; i < accounts.length; i++) {
                Account acc = accounts[i];
                System.out.println( "[" + (i + 1) + "] " + acc.accountType + " Account | Acc No: " + acc.accountNumber);
            }
}
