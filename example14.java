import java.util.Random;
import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Random random = new Random();
        int l = random.nextInt(26);
        Scanner scanner = new Scanner(System.in);
        char letter = (char) (l + 97);

        boolean game = true;
        while (game) {
            System.out.println("Угадайте букву");
            char let = scanner.next().charAt(0);
            if (let == letter) {
                System.out.println("Right");
                game = false;
            } else if (let < letter)
                System.out.println("You're too low");
            else {
                System.out.println("You're too high");
            }
        }
    }
}
