import java.util.Scanner;

public class Paswoord {

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        System.out.println("Welkom op het inlog portaal, kies een gebruikersnaam:");
var gebruikersnaam = s.nextLine();
        System.out.println("Uw gebruikersnaam is:" +gebruikersnaam+ " Deze is onthouden.");
        System.out.println();
        System.out.println(" Voer een wachtwoord in: ");
      /*  var c = System.console();
        var pw = c.readPassword();

       */
        var wachtwoord = s.nextLine();
        boolean check = true;
        System.out.println("Uw account is aangemaakt en ingesteld.");
        System.out.println();
        do {
            {
                System.out.println("Uw gebruikernaam is:" + gebruikersnaam);
                System.out.println("Voer uw wachtwoord in:");
                var input = s.nextLine();
                if (input == wachtwoord) {
                    check = true;
                    System.out.println("U bent ingelogd.");

            } else if (input != wachtwoord) {
                    System.out.println("U heeft een foutief wachtwoord ingevoerd, probeer het opnieuw.");
                    input=s.nextLine();
                    check = false;

                }

            }
        } while(!check);
}
        }

