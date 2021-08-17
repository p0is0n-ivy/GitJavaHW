package project1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("******************");
        checkSumSign(5, -6);
        System.out.println("******************");
        System.out.println(printColor(8));
        System.out.println("******************");
        if (compareNumbers(5, -9)) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println("******************");
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        }
    public static String printColor(int value) {
        if (value <= 0) {
            return "Красный";
        } else if (value > 0 && value <= 100) {
            return "Желтый";
        } else {
            return "Зеленый";
        }
    }

    public static boolean compareNumbers(int a, int b) {
        return a >= b;
    }
}