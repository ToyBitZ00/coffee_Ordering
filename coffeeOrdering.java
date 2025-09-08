package coffee_Ordering;

import java.util.Scanner;

public class coffeeOrdering {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String ans;
        String size;
        int price, total, quantity, final_Order = 0;

        System.out.println("                **Coffee**");
        System.out.println("Code     Name                  **Price**   ");
        System.out.println("                            Medium       Large");
        System.out.println(" 1       Coffee Latte        100          150");
        System.out.println(" 2       Coffee Mocha        120          180");
        System.out.println(" 3       Coffee Matcha       150          200");
        System.out.println(" 4       Coffee Brewed       100          120");

        obj.close();
    }
}
