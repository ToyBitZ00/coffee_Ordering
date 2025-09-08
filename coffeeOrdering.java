package coffee_Ordering.coffee_Order;

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

        System.out.print("\nItem Code: ");
        int code = obj.nextInt();
        switch (code) {
            case 1:
                System.out.println("Item name: Coffee Latte");
                System.out.print("Item size: ");
                size = obj.next().toLowerCase();
                if (size.equals("med")) {
                    System.out.println("Item price = 100");
                    price = 100;
                } else if (size.equals("large")) {
                    System.out.println("Item price = 150");
                    price = 150;
                } else {
                    System.out.println("Invalid Size");
                    return;
                }
                break;
        }
        obj.close();
    }
}
