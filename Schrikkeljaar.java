import java.util.Scanner;

public class Schrikkeljaar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Tik het jaartal in");
        int jaartal = input.nextInt();
        System.out.println(jaartal);
        // jaartal%4 ==0 && jaartal%100 != 0  || jaartal %400 ==0
        if (jaartal%4 ==0 && jaartal%100 != 0  || jaartal %400 ==0){
            System.out.println(" ja "+jaartal+" is een schrikkeljaar ");

        }else {
            System.out.println(" Neen "+jaartal+"  is geen schrikkeljaar");
        }


            // voorbeeld :
        // if (time < 18) {
        //      System.out.println("Good day.");
        //    } else {
        //      System.out.println("Good evening.");
        //    }


    }
}
