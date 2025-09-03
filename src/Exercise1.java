import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //övning 1.2

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
    }
}
