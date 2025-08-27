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
        String name = "Gabriel Note";
        int age = 31;
        int numberOfSiblings = 2;
        String favoriteFood = "Ramen";
        double height = 1.86;
        boolean iLikeCoffe = false;
        System.out.println("lite om mig");
        System.out.printf(format1_3, "Namn: ",name);
        System.out.printf(format1_3, "Favoritmat: ",favoriteFood);
        System.out.printf(format1_3, "Ålder: ",age);
        System.out.printf(format1_3, "Antal syskon: ",numberOfSiblings);
        System.out.printf(format1_3, "Höjd: ",height + " m");
        System.out.printf(format1_3, "Jag gillar kaffe: ",iLikeCoffe);
        System.out.println(" ");

        //Övning 2.1

        System.out.println("Skriv ert namn: ");
        String name1 = scanner.nextLine();
        System.out.println("Skriv er ålder: ");
        String age1 = scanner.nextLine();
        System.out.println("Skriv var ni bor: ");
        String placeOfResidence = scanner.nextLine();
        System.out.println("Hej " + name1 + " välkommen till " + placeOfResidence + "! (trotts att ni är " + age1 + " år gammal.");
        */

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


        //Övning 2.3




    }
}