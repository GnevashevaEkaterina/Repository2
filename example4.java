import java.util.Scanner;

public class example4 {
    public  static void main(String[] args) {
        System.out.println("Введите число");
        int i=0;
        Scanner scanner = new Scanner(System.in);
        // String str = scanner.next();
        int a = scanner.nextInt();
        String str=""+a;
        int b = str.length();
        b--;

        while (str.charAt(i) == str.charAt(b) && (b != 0)) {
            i++;
            b--;
        }
        if (b==0){
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
