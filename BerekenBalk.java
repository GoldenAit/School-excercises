import java.util.Scanner;
public class BerekenBalk {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" geef de lengte ");
        int lengte = sc.nextInt();
        System.out.println(" Geef de breedte ");
        int breedte = sc.nextInt();
        System.out.println(" geef de hoogte ");
        int hoogte = sc.nextInt();
        int oppervlakteBalk = 2*breedte*hoogte + 2* lengte*hoogte + 2* breedte*lengte;
        int inhoud = lengte * breedte * hoogte;
        System.out.println(" de oppervlakte is " + oppervlakteBalk);
        System.out.println(" de inhoud is" + inhoud);

    }

}
