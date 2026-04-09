package Abstraction;

public class CreditCardProcessor implements PaymentProcessor {
    
    public void process(double amount){

        System.out.println("The credit card implemented process.");
    }
}
