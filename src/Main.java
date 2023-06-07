public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int amount ;
        int year ;

        System.out.println("Сумма:1_000_000 рублей, Срок:1 год");
        System.out.println(service.calculate(1000000, 1));

        System.out.println("Сумма:1_000_000 рублей, Срок:2 года");
        System.out.println(service.calculate(1000000, 2));

        System.out.println("Сумма:1_000_000 рублей, Срок:3 года");
        System.out.println(service.calculate(1000000, 3));

    }
}