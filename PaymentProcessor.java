public interface PaymentProcessor {
    
    void process(double amount);
}
/* 
The calling code doesnt care simply because it uses the implementation as it bases,
so if you use a creditcard you automatically use it own process code and likewise regarding the paypal,
it is a form of upcasting then to the interface PaymentProcessor then downcasting back when wanting to use the process method.
*/