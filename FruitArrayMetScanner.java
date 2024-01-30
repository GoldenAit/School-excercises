import java.util.Scanner;

public class FruitArrayMetScanner {
    public static void main(String[] args) {
        String[] fruitmand = new String[6];
        Scanner input = new Scanner(System.in);
        for (int i=0; i< fruitmand.length; i++){
            System.out.println(" Geef fruit         " +i); // spaties voor '' op het einde
            fruitmand [i] = input.nextLine();

        }
        System.out.println(" Dit zijn de gekozen producten"); // om dit 1x af te drukken ( moet buiten de lus)
        for (int i=0; i< fruitmand.length; i++){

            System.out.println( fruitmand[i] );
        }
    }
}
