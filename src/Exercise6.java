import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Övning 6.1

        System.out.println("Välkommen, Gör ett val för att komma vidare");
        boolean loopCheck6_1 = true;
        while (loopCheck6_1) {
            System.out.println(" ");
            System.out.println("1 för att räkna ut arean av en rektangel");
            System.out.println("2 för att räkna ut arean av en cirkel");
            System.out.println("3 för att avsluta programmet");
            int selection6_1 = scanner.nextInt();
            double result6_1 = 0;
            switch (selection6_1) {
                case 1:
                    System.out.println("Ange första sidans längd");
                    double sideA = scanner.nextDouble();
                    System.out.println("Ange andra sidans längd");
                    double sideB = scanner.nextDouble();
                    result6_1 = sideA * sideB;
                    System.out.println("Arean är " + result6_1 + " (" + sideA + " * " + sideB + ")");
                    break;
                case 2:
                    System.out.println("Ange cirkelns radie");
                    double radius6_1 = scanner.nextDouble();
                    result6_1 = Math.PI * radius6_1 * radius6_1;
                    System.out.println("Arean av cirkeln är " + result6_1);
                    break;
                case 3:
                    System.out.println("Tack för att ni använde vår areaberäknare");
                    loopCheck6_1 = false;
                    break;
            }
        }



        // Övning 6.2

        System.out.println("Ange ålder (mellan 1-120): ");
        int age6_2;
        String tryAgain = " ";
        do {
            System.out.println(tryAgain);
            tryAgain = "Ogiltigt, ange din ålder igen (1-120)";
            age6_2 = scanner.nextInt();
        } while (age6_2 < 1 || age6_2 > 120);
        System.out.println("Er ålder är " + age6_2);

    }
}
