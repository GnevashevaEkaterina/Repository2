import java.util.Scanner;

public class example5 {
    public  static void main(String[] args) {
        int a,s;
        System.out.println("Введите натуральное число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        s=0;
        while (num != 0){
            a = num % 10;
            num = num / 10;
            s = s+a;
        }
        System.out.println("Сумма цифр числа = "+s);
    }
}
