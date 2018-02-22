import java.util.Scanner;

public class example6 {
    public  static void main(String[] args) {
        double w;
        System.out.println("Введите вес");
        Scanner scanner = new Scanner(System.in);
        w = scanner.nextDouble();
        double moon;
        moon = 0.17*w;
        System.out.println("Ваш вес на Луне - "+moon);
    }
}
