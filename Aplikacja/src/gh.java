import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class gh {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        Scanner writer = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            liczby.add(i);
        }
        String z = "qwertyuiopasdfghjklzxcvbnm";
        String y = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String x = "!@#$%^&*()<>,.:;{}[]|?/+=-_";

        System.out.print("Wybierz rodzaj hasła");
        Random rand = new Random();
        String dz = writer.next();
        switch (dz) {
            case "1":
                int ilosc = 8;
                for (int i = 0; i < ilosc; i++) {
                    int randomChar = rand.nextInt(z.length());
                    Character rndmElem = z.charAt(randomChar);
                    System.out.print(rndmElem);
                }
                break;
            case "2":
                int ilosc1 = 8;
                String zy = z + y;
                for (int a = 0; a < ilosc1; a++) {
                    int randomChar1 = rand.nextInt(zy.length());
                    Character rndmElem1 = zy.charAt(randomChar1);
                    System.out.print(rndmElem1);
                }
                break;

            case "3":
                int ilosc2 = 8;
                String zyx = z + y + x;
                for (int b = 0; b < ilosc2; b++) {
                    int randomChar2 = rand.nextInt(zyx.length());
                    Character rndmElem2 = zyx.charAt(randomChar2);
                    System.out.print(rndmElem2);
                }
                break;
            case "4":
                int ilosc3 = rand.nextInt(16 ,30);
                String zyxq = z + y + x;
                for (int b = 0; b < ilosc3; b++) {
                    int randomChar3 = rand.nextInt(zyxq.length());
                    Character rndmElem3 = zyxq.charAt(randomChar3);
                    System.out.print(rndmElem3);
                }
                break;
            case "5":
                break;
            default:
                System.out.println("zły rodzaj");
        }
    }
}
