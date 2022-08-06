import java.util.Random;

public class Gambler {

    static final int everyday=100;
    static final int bet=1;

    public static void main(String[] args) {
        System.out.println("welcome to gambling simulator");
        int Stake = everyday;
        int month = 1;
        int day = 1;
        int UnluckyDay = 1;
        int LuckyDay = 1;
        int UnluckyMonth= 1;
        int LuckyMonth = 1;
        int LuckyDayMoney = everyday;
        int UnluckyDayMoney = everyday;

        while (month<=12){
            day=1;
            while (day<=30){
                Stake=everyday;
                Random r=new Random();
                int daily=r.nextInt(10);
                for (int i=0;i<daily;i++){
                    int check=(int) Math.floor(Math.random()*10)%2;

                    if(check==bet){
                        Stake=Stake+1;
                        System.out.println("win");
                    }else {
                        Stake=Stake-1;
                        System.out.println("loose");
                    }
                }
                if(LuckyDayMoney<Stake){
                    LuckyDay=day;
                    UnluckyDay=month;
                    LuckyDayMoney=Stake;
                }
                if(UnluckyDayMoney>Stake){
                    UnluckyDay=day;
                    UnluckyMonth=month;
                    UnluckyDayMoney=Stake;
                }
                day++;
            }
            month++;
        }
        System.out.println("lucky day " +LuckyDay +"in month " +LuckyMonth+"max money Won is " + (LuckyDayMoney-Stake) +"rs");
        System.out.println("unlucky day " +UnluckyDay +"in month " +UnluckyMonth+"max money lost is " + (Stake-LuckyDayMoney) +"rs");

    }

}
