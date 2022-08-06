public class Gambler {

    static final int everyday=100;
    static final int bet=1;

    public static void main(String[] args) {
        System.out.println("welcome to gambling simulator");


        int stake=everyday;
        while (stake>50 &&stake<150){
            int random=(int)Math.floor(Math.random()*10)%2;

            if(random==bet){
                stake=stake+1;
                System.out.println("win");
            }else {
                stake=stake+1;
                System.out.println("loose");
            }
            if(stake==50){
                System.out.println("player resigned due to loosing"+stake);
            }else {
                System.out.println("player resigned due to winning" + stake);
            }
        }
    }

}
