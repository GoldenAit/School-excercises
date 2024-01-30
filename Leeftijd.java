
import java.util.Scanner;
        // importeren van de scanner
public class Leeftijd {
            public static void main(String[] args) {
                System.out.println("Wat is jouw naam ?");
                Scanner myObj = new Scanner(System.in);
                String naam = myObj.nextLine();
                System.out.println(" in welk jaar ben jij geboren");
                int geboorteJaar = myObj.nextInt();

                int ouderdom = 2023 - geboorteJaar;
                System.out.println("je naam is"+ naam);
                System.out.println(" je geboortejaar is" + geboorteJaar);
                System.out.println("je bent zo oud: " + ouderdom);
            }

}
f