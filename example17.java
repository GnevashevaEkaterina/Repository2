import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class example17 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[][] array = new Integer[6][7];
        int r = random.nextInt();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 1; i++) {
            System.out.print(" ");
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            Arrays.sort(array[i], Collections.reverseOrder());
            for (int j = 0; j < 7; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();

        }

    }
}
