import java.util.Scanner;

public class ProgramA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Program A: Interaktiv quiz

        System.out.println("Välkommen till den triviala quizzen");
        System.out.println("Varje fråga kommer ha 4 alternativ mellan siffrorna 1-4");
        System.out.println("Vänligen ange det alternativet som passar bäst genom att trycka på tillhörande siffra på vänster sida (1-4)");
        System.out.println(" ");
        boolean loopCheck = true;
        int currentAnswer;
        int correctAnswer1 = 2;
        int correctAnswer2 = 1;
        int correctAnswer3 = 4;
        int correctAnswer4 = 1;
        int correctAnswer5 = 2;
        int numberOfCorrectAnswers = 0;
        String grade = "Ej tilldelad än";
        boolean allCorrect = false;
        // Fråga  1
        System.out.println("Fråga 1: vad är 1+4?");
        System.out.println(" ");
        System.out.println("1:    4");
        System.out.println("2:    5");
        System.out.println("3:    14");
        System.out.println("4:    1");
        while (loopCheck) {
            currentAnswer = scanner.nextInt();
            switch (currentAnswer){
                case 1, 3, 4:
                    System.out.println("Tyvärr, nummer " + correctAnswer1 + " var rätt svar");
                    System.out.println(" ");
                    loopCheck = false;
                    break;
                case 2:
                    numberOfCorrectAnswers += 1;
                    System.out.println("Rätt svar");
                    System.out.println(" ");
                    loopCheck = false;
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }
        }
        // Fråga 2
        System.out.println("Fråga 2: Vad är 4/0");
        System.out.println(" ");
        System.out.println("1:    Det går inte");
        System.out.println("2:    0");
        System.out.println("3:    Oändligt");
        System.out.println("4:    40");
        loopCheck = true;
        while (loopCheck) {
            currentAnswer = scanner.nextInt();
            switch (currentAnswer){
                case 2, 3, 4:
                    System.out.println("Tyvärr, nummer " + correctAnswer2 + " var rätt svar");
                    System.out.println(" ");
                    loopCheck = false;
                    break;
                case 1:
                    numberOfCorrectAnswers += 1;
                    System.out.println("Rätt svar");
                    System.out.println(" ");
                    loopCheck = false;
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }
        }
        // Fråga 3
        System.out.println("Fråga 3: Vad är 7*8");
        System.out.println(" ");
        System.out.println("1:    49");
        System.out.println("2:    63");
        System.out.println("3:    78");
        System.out.println("4:    56");
        loopCheck = true;
        while (loopCheck) {
            currentAnswer = scanner.nextInt();
            switch (currentAnswer){
                case 1, 2, 3:
                    System.out.println("Tyvärr, nummer " + correctAnswer3 + " var rätt svar");
                    System.out.println(" ");
                    loopCheck = false;
                    break;
                case 4:
                    numberOfCorrectAnswers += 1;
                    System.out.println("Rätt svar");
                    System.out.println(" ");
                    loopCheck = false;
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }
        }
        // Fråga 4
        System.out.println("Fråga 4: Vad är 3-4");
        System.out.println(" ");
        System.out.println("1:    -1");
        System.out.println("2:    34");
        System.out.println("3:    0");
        System.out.println("4:    1");
        loopCheck = true;
        while (loopCheck) {
            currentAnswer = scanner.nextInt();
            switch (currentAnswer){
                case 2, 3, 4:
                    System.out.println("Tyvärr, nummer " + correctAnswer4 + " var rätt svar");
                    System.out.println(" ");
                    loopCheck = false;
                    break;
                case 1:
                    numberOfCorrectAnswers += 1;
                    System.out.println("Rätt svar");
                    System.out.println(" ");
                    loopCheck = false;
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }
        }
        // Fråga 5
        System.out.println("Fråga 5: Vad är 10% av 100");
        System.out.println(" ");
        System.out.println("1:    1");
        System.out.println("2:    10");
        System.out.println("3:    0,1");
        System.out.println("4:    110");
        loopCheck = true;
        while (loopCheck) {
            currentAnswer = scanner.nextInt();
            switch (currentAnswer){
                case 1, 3, 4:
                    System.out.println("Tyvärr, nummer " + correctAnswer5 + " var rätt svar");
                    System.out.println(" ");
                    loopCheck = false;
                    break;
                case 2:
                    numberOfCorrectAnswers += 1;
                    System.out.println("Rätt svar");
                    System.out.println(" ");
                    loopCheck = false;
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen");
            }
        }
        // Resultat och betyg
        switch (numberOfCorrectAnswers){
            case 0:
                grade = "F";
                break;
            case 1:
                grade = "E";
                break;
            case 2:
                grade = "D";
                break;
            case 3:
                grade = "C";
                break;
            case 4:
                grade = "B";
                break;
            case 5:
                grade = "A";
                allCorrect = true;
                break;
            default:
                System.out.println("Omöjligt betyg, något fuffens försigår");
        }
        System.out.println("Tack för att ni tog mitt quiz, här kommer ert resultat");
        if (allCorrect){
            System.out.println("Grattis! Ni fick rätt på alla frågor! Betyg " + grade + "!");
        }
        else {
            System.out.println(numberOfCorrectAnswers + "/5 rätta svar, vilket ger er betyget " + grade + "!");
        }
    }
}
