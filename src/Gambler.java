import java.util.Random;
import java.util.Scanner;

public class Gambler {

    static final int everyday = 100;
    static final int bet = 1;

    public static void main(String[] args) {
        System.out.println("welcome to gambling simulator");
        int Stake = everyday;
        int month = 1;
        int day = 1;
        int UnluckyDay = 1;
        int LuckyDay = 1;
        int UnluckyMonth = 1;
        int LuckyMonth = 1;
        int LuckyDayMoney = everyday;
        int UnluckyDayMoney = everyday;
        int moneyEarned = 0;

        while (month <= 12) {
            day = 1;
            while (day <= 30) {
                Stake = everyday;
                Random r = new Random();
                int daily = r.nextInt(10);
                for (int i = 0; i < daily; i++) {
                    int check = (int) Math.floor(Math.random() * 10) % 2;

                    if (check == bet) {
                        Stake = Stake + 1;
                        System.out.println("win");
                    } else {
                        Stake = Stake - 1;
                        System.out.println("loose");
                    }
                    day++;
                    moneyEarned=moneyEarned+Stake;
                }
                if(moneyEarned>Stake){
                    System.out.println("month  " +month +" won money is "+moneyEarned + "would you like to play ,press 1 for yes and 2 for no" );

                    Scanner sc=new Scanner(System.in);
                    int choice =sc.nextInt();
                    month++;
                    if(choice==1)
                        break;
                    else {
                        System.out.println("you lost " + moneyEarned + " rs");
                    }
                }
            }
        }
    }
}


