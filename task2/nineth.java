package task2;

public class nineth {
    public static void main(String[] args) {
        int units = 250;
        double billpay = 0;
        if (units <= 50) {
            billpay = units * 0.50;
        } else if (units > 50 && units <= 150) {
            billpay = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units > 150 && units <= 250) {
            billpay = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        } else if (units > 250) {
            billpay = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }
        billpay = billpay + billpay * 0.2;
        System.out.println("Bill : " + billpay);
    }
}
