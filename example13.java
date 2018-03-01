import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class example13 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array = new double[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1000);
        }

        boolean go = true;
        while (go) {
            System.out.println("Выберите действие");
            System.out.println("1. Вывести массив на экран");
            System.out.println("2. Увеличить элемент массива на 10%");
            System.out.println("3. Выход");
            System.out.println("4. Сортировка");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        System.out.println((int) array[i]);
                    }
                    break;

                case 2:
                    System.out.println("Введите номер элемента массива, который хотите увеличить");
                    int b = scanner.nextInt();
                    array[b] = array[b] * 1.1;
                    System.out.println(array[b]);
                    break;
                case 3:
                    go = false;
                    break;
                case 4:
                    Arrays.sort(array);
                    break;
            }
        }
    }
}
