import java.util.Scanner;

public class PasswordService {
    private static PasswordGenerator _generator = new PasswordGenerator();
    public void PasswordService()
    {
      while(true)
              try {
        Scanner writer = new Scanner(System.in);
        System.out.println("Wybierz rodzaj hasła: \n1.Małe litery \n2.Duże litery\n3.Mix \n4.Małe litery i liczby\n5.Duże litery i liczby\n6.wszystko \n0.Koniec ");
        String password = "";
        String passTypeNr = writer.next();
        if(passTypeNr.equals("0"))
          {
                      break;
           }
        System.out.println("Podaj długosc hasła :");
        int len = writer.nextInt();

        while (len ==0)
        {
            System.out.println("długosc nie może wynosic zero");
            System.out.println("Podaj długosc hasła : \n");
            len = writer.nextInt();

        }

        switch (passTypeNr) {
            case "1":
                password = _generator.GeneratePassword(PasswordTypes.LowercaseLetterOnly, len);
                break;
            case "2":
                password = _generator.GeneratePassword(PasswordTypes.UppercaseLettersOnly, len);
                break;
            case "3":
                password = _generator.GeneratePassword(PasswordTypes.MixedCaseLetter, len);
                break;
            case "4":
                password = _generator.GeneratePassword(PasswordTypes.LowerAndNumber, len);
                break;
            case "5":
                password = _generator.GeneratePassword(PasswordTypes.UpperAndNumber, len);
                break;
            case "6":
                password = _generator.GeneratePassword(PasswordTypes.ALL, len);
                break;
            case "0":
             return;
        }
        System.out.println(password);
    }
        catch (Exception ex)
    {

    }
}
}
