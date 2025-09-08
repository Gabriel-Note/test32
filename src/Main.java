import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FoodProducts foodProducts = new FoodProducts();

        /*
        String format4_2 = "%-10s%s%n";
        // Val av produkter
        for (int i = 0; i < foodProducts.product.length; i++){
            System.out.printf(
                    format4_2,
                    i+1 + ". " + foodProducts.product[i] + ": ",
                    foodProducts.productPrice[i] + " kr"
            );
        };
        */

        while (true) {
            foodProducts.printSelection();
            int currentSelection = scanner.nextInt();
            switch (currentSelection) {
                case 1:
                    while (currentSelection != 0) {
                        foodProducts.printStoreItemsAndPrice();
                        currentSelection = scanner.nextInt();
                        if (foodProducts.validInputs(currentSelection)) {
                            System.out.println("Hur många vill ni köpa totalt?");
                            int amount = scanner.nextInt();
                            foodProducts.cart[currentSelection - 1] = amount;
                        }
                        else {
                            foodProducts.printInvalidInput();
                        }
                    }
                    break;
                case 2:
                    foodProducts.printCart();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println();
                    int sum = 0;
                    for (int i = 0; i < foodProducts.cart.length; i++){
                        foodProducts.total[i] = foodProducts.cart[i] * foodProducts.productPrice[i];
                        if (foodProducts.total[i] != 0){
                            foodProducts.printReceipt(i);
                            sum += foodProducts.total[i];
                        }
                    }
                    System.out.println("");
                    System.out.println("Totalt pris: " + sum + " kr");
                    System.out.println("");
                    System.out.println("Tack för att ni handlade hos oss");
                    return;
                case 4:
                    System.out.println("Tack för att ni handlade hos oss");
                    return;
                default:
                    foodProducts.printInvalidInput();
            }
        }
    }
}






