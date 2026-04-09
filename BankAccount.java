public class BankAccount {

    private float balance = 0;


    public float getBalance(){

        return this.balance;
    }

    private void setBalance(float balance){

        this.balance = balance;
    }

    public void deposit(float balance){

        if (balance >= 0){

        setBalance(getBalance() + balance);
        }

        else{

        System.out.println("You cant deposit a negative value.");
        }
    }

    public void withdraw(float balance){

        if (balance >= 0 && getBalance() >= balance){

            setBalance(getBalance() - balance);
        }

        else{

            System.out.println("Account funds are insufficient.");
        }
    }

    public BankAccount(){

        setBalance(balance = 0);
    }

    public BankAccount(float balance){

        this.balance = 0;
        deposit(balance);
    }
}