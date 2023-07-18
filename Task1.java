package homework;

public class Task1 {
    public static void main(String[] args) {
        double m = 8.6;
        double n = 8.6;
        double d1 = Math.abs(10 - m);
        double d2 = Math.abs(10 - n);
        if (d1 == d2) {
            System.out.println("Оба числа одинаково близки: " + m + "; " + n);
            return;
        }
        if (d1 > d2) {
            System.out.println("Ближайшее число: " + n);
        } else {
            System.out.println("Ближайшее число: " + m);
        }
    }
}
