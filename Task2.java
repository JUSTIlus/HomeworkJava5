package homework;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int n = new Random().nextInt(28801);
        System.out.println(n);
        int hours = n / 60 / 60;
        if (hours == 0) {
            System.out.println("Осталось менее часа");
            return;
        }
        if (hours == 1) {
            System.out.println("Остался " + hours + " час");
            return;
        }
        if (hours < 5) {
            System.out.println("Осталось " + hours + " часа");
            return;
        }

        System.out.println("Осталось " + hours + " часов");


    }
}
