public class CreditPaymentService {
    public int calculate(int amount, int year) {

        double percent = 9.99 / (100 * 12);
        int month = year * 12;
        double a = Math.pow((1 + percent), month);
        double b = amount * ((percent * a) / (a - 1));
        int payment = (int) b;

        return payment;

    }
}
