import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// Övning 3.1

        System.out.println("Ålderskontroll");
        System.out.println("Ange er ålder: ");

        int age3_1 = scanner.nextInt();
        System.out.println("Okej, om ni är " + age3_1 + " eller över så får ni: ");
        if (age3_1 >= 18) {
            System.out.println("köra bil!");
        }
        else {
            System.out.println("INTE köra bil!");
        }
        if (age3_1 >= 20) {
            System.out.println("köpa alkohol!");
        }
        else {
            System.out.println("INTE köpa alkohol!");
        }
        if (age3_1 >= 20) {
            System.out.println("gå på Systembolaget!");
        }
        else {
            System.out.println("INTE gå på Systembolaget!");
        }
        if (age3_1 >= 65) {
            System.out.println("gå i pension!");
        }
        else {
            System.out.println("INTE gå i pension!");
        }



        // Övning 3.2

        System.out.println("Hur många poäng fick ni på provet?");
        int score = scanner.nextInt();
        if (score > 89){
            System.out.println("Betyg A, Grattis ni fick ett toppenbetyg!");
        }
        if (score > 79 && score <= 89){
            System.out.println("Betyg B, Grattis ni fick ett toppenbetyg!");
        }
        if (score > 69 && score <= 79){
            System.out.println("Betyg C, Grattis ni blev godkänd!");
        }
        if (score > 59 && score <= 69){
            System.out.println("Betyg D, Grattis ni blev godkänd!");
        }
        if (score < 60){
            System.out.println("Betyg F, nu får ni ha kul med att lära er mer!");
        }




        // Övning 3.3

        //Scanner scanner2 = new Scanner(System.in);

        System.out.println("Vad är temperaturen idag? (°C)");
        double temp3_3 = scanner.nextDouble();
        if (temp3_3 < 0){
            System.out.println("Ta på dig vinterjacka!");
        }
        if (temp3_3 >= 0 && temp3_3 < 10){
            System.out.println("Kläd dig varmt!");
        }
        if (temp3_3 >= 10 && temp3_3 < 20){
            System.out.println("Perfekt väder för en hoodie!");
        }
        if (temp3_3 >= 20){
            System.out.println("Shorts-väder!");
        }
    }
}
