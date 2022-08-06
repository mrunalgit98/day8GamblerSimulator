public class Gambler {

    static final int everyday=100;
    static final int bet=1;

    public static void main(String[] args) {
        System.out.println("welcome to gambling simulator");
        int stake=everyday;
        int month=1;
        while (month<=12){
            int day=1;
            System.out.println("month " + month);
            while (day<=30){
                stake=everyday;
                int random=(int)Math.floor(Math.random()*10)%2;
                if (random == bet) {
                    stake = stake + 1;
                    System.out.println("You Win.");
                } else {
                    stake = stake - 1;
                    System.out.println("You Loose.");
                }
                if(stake<everyday){
                    System.out.println("day " + day +"lost " +(everyday-stake)+"rs");
                }else {
                    System.out.println("day " + day +"lost " +(stake-everyday)+"rs");

                }
                day++;
            }
            month++;
            System.out.println();
        }
    }

}
