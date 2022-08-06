public class Gambler {

    static final int everyday=100;
    static final int bet=1;

    public static void main(String[] args) {
        System.out.println("welcome to gambling simulator");
        int stake=everyday;

        for(int i=0;i<=20;i++){
            int random=(int)Math.floor(Math.random()*10)%2;

            if(random==bet){
                stake=stake+1;
                System.out.println("win");
            }else {
                stake=stake-1;
            }
                System.out.println("loose");
        }
        if(stake<everyday){
            System.out.println("after 20 day player lost " +(everyday-stake)+"rs");
        }else {
            System.out.println("after 20 day player won " +(stake-everyday)+"rs");
        }
    }

}
