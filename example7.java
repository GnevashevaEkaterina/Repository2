import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите натуральное число");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int d = 1;
        while (d <= a) {
            if ((a % d) == 0)
                System.out.print(d + ", ");
            d++;
        }
    }
}


