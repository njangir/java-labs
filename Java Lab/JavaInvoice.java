import java.util.Scanner;

class pizza{
    int rate = 100;
}
class puff{
    int rate = 20;
}
class cooldrink{
    int rate = 10;
}
public class JavaInvoice {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of Pizzas: ");
        int noPiz = s.nextInt();
        System.out.println("Enter no of Puffs: ");
        int noPuf = s.nextInt();
        System.out.println("Enter no of Cooldrinks: ");
        int noCooldrink = s.nextInt();
        pizza piz = new pizza();
        puff puff = new puff();
        cooldrink cooldrink = new cooldrink();
        System.out.println("Pizza: " + noPiz + " Cost: " + noPiz*piz.rate);
        System.out.println("Puff: " + noPuf + " Cost: " + noPuf*puff.rate);
        System.out.println("Cooldrink: " + noCooldrink + " Cost: " + noCooldrink*cooldrink.rate);
        System.out.println("Total: " + (noCooldrink+noPuf+noPiz) + " Cost: " + (noCooldrink*cooldrink.rate+noPuf*puff.rate+noPiz*piz.rate));
        s.close();
    }
}
