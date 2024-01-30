import java.util.Scanner;
public class BerekenOmtrekOppervlakteRechthoek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("geef de de lengte van de rechthoek");
        int lengte = scan.nextInt();

        System.out.println("geef de breedte van de rechthoek");
        int breedte =scan.nextInt();
        System.out.println("de lengte is" + lengte );
        System.out.println(" de breedte is " + breedte );
        int omtrek = 2*lengte +2*breedte;
        int oppervlakte = lengte * breedte ;
        System.out.println("de  omtrek is" + omtrek );
        System.out.println(" de oppervlakte is " + oppervlakte);


    }

}
