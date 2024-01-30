import java.util.Scanner;

public class BerekenEindcijfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef deel 1 (op 20): ");
        double deel1 = sc.nextDouble();
        System.out.println(" Geef deel 2 (op 20): ");
        double deel2 = sc.nextDouble();
        System.out.println(" Geef deel 3 (op 20): ");
        double deel3 = sc.nextDouble();
        System.out.println(" Geef deel 4 (op 20): ");
        double deel4 = sc.nextDouble();
        double berekening = deel1/100*15 + deel2/100*25 + deel3/100*20 + deel4/100*40;
        System.out.println(" Het totaalcijfer van de student: " + berekening + "op 20 ");

    }
}
