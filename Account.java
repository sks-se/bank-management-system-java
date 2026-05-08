public class Account {

    int accountNumber;
    int balance;
    String accountType;

    // default constructor
    Account(){};

    // parameterized constructor
    Account(int acnum, int bal, String type){
        this.accountNumber=acnum;
        this.balance=bal;
        this.accountType= type;
    }
    // deposit
    void deposit (int amount){
        balance = balance+amount;
        System.out.println("Deposit Successful\n"+"New Balance: " + balance);
    }
    // withdrawl
    void withdraw (int amount){
        if(amount <= balance){
            balance = balance-amount;
            System.out.println("withdraw successful\n"+ "Remaining balance:" +balance);
        }else {
            System.out.println("Withdraw Failed!! Insufficient Balance");
        }
    }
    //check balance
    void checkbal(){
        System.out.println("Balance: "+ balance);
    }
}
