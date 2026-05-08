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
        for(Account acc: accounts){
            System.out.println(acc.accountNumber +"-"+ acc.accountType);
        }
    }
}
