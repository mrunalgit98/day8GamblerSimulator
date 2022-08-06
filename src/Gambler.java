public class Gambler {

    static final int everyday=100;
    static final int bet=1;

    public static void main(String[] args) {
        System.out.println("welcome to gambling simulator");

        int random=(int) Math.floor(Math.random()*10%2);

        if(random==bet){
            System.out.println("win");
        }else{
            System.out.println("loose");
        }
    }

}
