public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //task2
        System.out.println("task2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //task3
        System.out.println("task3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        //task4
        System.out.println("task4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //task5
        System.out.println("task5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        //task6
        System.out.println("task6");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }
        //task7
        System.out.println("task7");
        for (int i = 1; i < 520; i *= 2) {
            System.out.println(i);
        }
        //task8
        System.out.println("task8");
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        //task9
        int total2 = 0;
        System.out.println("task9");
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей.");
        }
        //task10
        System.out.println("task10");
        for(int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i*2);
        }


    }
}