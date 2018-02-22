import java.util.Scanner;

public class example3 {
    public static void main(String[] args){
        boolean[][] days = new boolean[7][2];
        //Понедельник
        days[0][0]= true; //будний день
        days[0][1]= false; //отпуска нет

        //Вторник
        days[1][0]= true; //будний день
        days[1][1]= false; //отпуска нет

        //Среда
        days[2][0]= true; //будний день
        days[2][1]= false; //отпуска нет

        //Четверг
        days[3][0]= true; //будний день
        days[3][1]= true; //отпуск

        //Пятница
        days[4][0]= true; //будний день
        days[4][1]= false; //отпуска нет

        //Суббота
        days[5][1]= false; //выходной день
        days[5][1]= true; //отпуска нет

        //Воскресенье
        days[6][1]= false; //выходной день
        days[6][1]= true; //отпуска нет

        System.out.println("Введите номер дня недели");

        Scanner scanner = new Scanner(System.in);
        int day=scanner.nextInt();
        if (days[day][0]){
            if (!days[day][1])
                System.out.println("На работу");
            if (days[day][1])
                System.out.println("Отпуск");

        }
        if (!days[day][0]){
            System.out.println("Выходной");
        }

    }
}


