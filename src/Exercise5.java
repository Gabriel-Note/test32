import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Övning 5.1

        boolean loopCheck = true;
        while (loopCheck){
            System.out.println("Ange ett nummer för vad ni vill göra");
            System.out.println("1 för att räkna från 1 till 10");
            System.out.println("2 för att räkna från 10 till 1");
            System.out.println("3 för att räkna alla jämna tal från 2 till 20");
            System.out.println("4 för att summera alla tal från 1 till 100");
            System.out.println("0 för att avsluta programmet");

            int selection5_1 = scanner.nextInt();
            int k;
            switch (selection5_1) {
                case 0:
                    System.out.println("Tack för att ni använde räknaren");
                    loopCheck = false;
                    break;
                case 1:
                    System.out.println("Du valde nummer 1");
                    k = 1;
                    while (k <= 10) {
                        System.out.println(k);
                        k++;
                    }
                    break;
                case 2:
                    System.out.println("Du valde nummer 2");
                    k = 10;
                    while (k >= 1) {
                        System.out.println(k);
                        k--;
                    }
                    break;
                case 3:
                    System.out.println("Du valde nummer 3");
                    for (k = 2; k <= 20; k += 2){
                        System.out.println(k);
                    }
                    break;
                case 4:
                    System.out.println("Du valde nummer 4");
                    int sum = 0;
                    for (k = 1; k <= 100; k++){
                        sum += k;
                    }
                    System.out.println("Totala summan är " + sum);
                    break;
                default:
                    System.out.println("Ogiltigt val!");
            }

        }



        // Övning 5.2

        System.out.println("För vilket nummer vill ni ha en multiplikationstabell?");
        System.out.println("ange ett heltal (funkar bäst för 1-10)");
        int multiplicationNumber = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            int result = i * multiplicationNumber;
            System.out.println(i + " * " + multiplicationNumber + " = " + result);
        }



        // Övning 5.3

        int secretNumber = 42;

        System.out.println("Gissa det hemliga nummret mellan 1-100 (heltal)");
        int guess = 0;
        while (guess != secretNumber) {
            guess = scanner.nextInt();
            if (guess > secretNumber) {
                System.out.println("För högt");
            } else if (guess < secretNumber) {
                System.out.println("för lågt");
            } else {
                System.out.println("Mitt i prick");
            }
        }

    }
}
