import java.util.Scanner;

public class example16 {
    public static void main(String[] args) {
        //  System.out.println("Введите количество полок");
        //Scanner scanner = new Scanner(System.in);
        int p = 50000;
        int c = 0;
        for (int i = 1; i < p; i++) {
            String str = String.valueOf(i);
            if (str.indexOf('2') != -1)
                c++;
        }
        System.out.println(c);
    }
}
