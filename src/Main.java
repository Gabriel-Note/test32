import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //Scan.nextline() kommer vänta på ett input från användaren
        //String fullName = scan.nextLine();

        //övning 1.2
        /*
        double x = 5;
        double y = 8;
        double area = x * y;
        double omkrets = x * 2 + y * 2;
        String format1_2 = "%-30s%s%n";
        //System.out.println("Arean för rummet är: " + "\t" + area + " kvadratmeter");
        //System.out.println("Omkretsen för rummet är: " + "\t" + omkrets + " meter");
        System.out.printf(format1_2, "Arean för rummet är: ",area + " kvadratmeter");
        System.out.printf(format1_2, "Omkretsen för rummet är: ",omkrets + " meter");
        System.out.printf(format1_2, "Omkretsen för rummet är: ",omkrets + " meter");
        System.out.println(" ");

        //övning 1.3

        String format1_3 = "%-24s%s%n";
        String name1_3 = "Gabriel Note";
        int age1_3 = 31;
        int numberOfSiblings = 2;
        String favoriteFood = "Ramen";
        double height = 1.86;
        boolean iLikeCoffe = false;
        System.out.println("lite om mig");
        System.out.printf(format1_3, "Namn: ",name1_3);
        System.out.printf(format1_3, "Favoritmat: ",favoriteFood);
        System.out.printf(format1_3, "Ålder: ",age1_3);
        System.out.printf(format1_3, "Antal syskon: ",numberOfSiblings);
        System.out.printf(format1_3, "Höjd: ",height + " m");
        System.out.printf(format1_3, "Jag gillar kaffe: ",iLikeCoffe);
        System.out.println(" ");

        //Övning 2.1

        System.out.println("Skriv ert namn: ");
        String name2_1 = scanner.nextLine();
        System.out.println("Skriv er ålder: ");
        String age2_1 = scanner.nextLine();
        System.out.println("Skriv var ni bor: ");
        String placeOfResidence = scanner.nextLine();
        System.out.println("Hej " + name2_1 + " välkommen till " + placeOfResidence + "! (trotts att ni är " + age2_1 + " år gammal.");


        // Övning 2.2

        String format2_2 = "%-24s%s%n";

        System.out.println("Ange två tal så kan jag räkna ut summan, produkten och genomsnittet av dessa till dig");
        System.out.println("Ange första nummret: ");
        float x = scanner.nextFloat();
        System.out.println("Ange andra nummret: ");
        float y = scanner.nextFloat();
        float sum = x + y;
        float product = x * y;
        float average = sum/2;
        System.out.printf(format2_2, "Summan: ",sum);
        System.out.printf(format2_2, "Produkten: ",product);
        System.out.printf(format2_2, "Genomsnittet: ",average);
        System.out.println(" ");


        //Övning 2.3

        String format2_3 = "%-15s%s%n";

        System.out.println("lokal valutakonverterare från SEK till EUR och USD");
        System.out.println("Ange ett belopp i SEK som ni vill konvertera");
        float money = scanner.nextFloat();
        float euro = money * 0.085f;
        float dollar = money * 0.091f;
        System.out.println(money + " SEK konverteras till: ");
        System.out.printf(format2_3, euro,"EUR");
        System.out.printf(format2_3, dollar,"USD");
*/
        // Övning 3.1

        System.out.println("Ålderskontroll");
        System.out.println("Ange er ålder: ");

        int age3_1 = scanner.nextInt();
        System.out.println("Okej, om ni är " + age3_1 + " så får ni: ");
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


    }
}