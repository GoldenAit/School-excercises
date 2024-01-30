import java.util.Scanner;

public class FruitmandMetVariabeleArray {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            //int fruitmandsize =3;
            System.out.println("Hoeveel fruit zou u willen ?" );
            int fruitmandsize= input2.nextInt();
            String[] fruitmand = new String[fruitmandsize];

            for (int i=0; i< fruitmand.length; i++){
                System.out.println(" Geef fruit " +i); // spaties voor '' op het einde
                fruitmand [i] = input.nextLine();

            }
            System.out.println(" Dit zijn de gekozen producten"); // om dit 1x af te drukken ( moet buiten de lus)
            for (int i=0; i< fruitmand.length; i++){

                System.out.println( fruitmand[i] );
            }
        }
    }

