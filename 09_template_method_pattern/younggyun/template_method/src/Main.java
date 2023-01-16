public class Main {
    public static void main(String[] args) {
        DebitPayMethod debitPayMethod = new DebitPayMethod("224-24-0354-136");
        debitPayMethod.create();

        CreditCardPayMethod creditCardPayMethod = new CreditCardPayMethod("3330-12322-122");
        creditCardPayMethod.create();
    }
}