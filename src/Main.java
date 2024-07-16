import com.gamestore.game.Game;

public class Main {
    public static void main (String[] args) {
        Game cod = new Game();
        cod.title = "Call of Duty";
        cod.price = 66.5;
        cod.discount = 12.5;

        System.out.println ("The game " + cod.title + " is stored in the position " + cod);

        Game ds2 = new Game();
        ds2.title = "Dark Souls II";
        ds2.price = 55.2;
        ds2.discount = 6.25;

        System.out.println ("The game " + ds2.title + " is stored in the position " + ds2);
        System.out.println("______________________________________________________________");

        System.out.println ("\nGame Price: " + cod.title + " is US$" + cod.price + " but, fortunately, today we have US$" + cod.discount +" discount.\nFinal Game Price: US$" + cod.getDiscountedPrice());
        System.out.println ("\nGame Price: " + ds2.title + " is US$" + ds2.price + " but, fortunately, today we have US$" + ds2.discount +" discount.\nFinal Game Price: US$" + ds2.getDiscountedPrice());
    }
}