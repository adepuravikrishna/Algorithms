import java.util.Scanner;

public class xmasTree {

public static final int TREE_MAXIMUM = 20;
public static final int TREE_MINIMUM = 3;

public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    //User introduction 
    System.out.println("This program prints a \"Christmas\" tree. You "
            + "choose how big the tree will be (within reason)");

    // prompt for and get user input
    System.out.println("How tall should the top of the tree be?");
    int treeHeight = keyboard.nextInt();
    while (treeHeight < TREE_MINIMUM || TREE_MAXIMUM < treeHeight) {
        System.out.println("That's not a valid size.  I can only do trees "
                + "from 3 to 20.");
        System.out.println("Qutting now.");
        System.exit(0);
    }

    //Print the top triangle section of the christmas tree
    for (int i = 0; i < treeHeight; i++) {
        for (int j = 0; j < treeHeight - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < (2 * i + 1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //Print the bottom rectangle section of the tree
    for (int c = 0; c <= (1 + (treeHeight / 5)); c++) {
        for (int d = 0; d <= (treeHeight / 3); d++) {
            System.out.print("");
        }
        System.out.printf("*");
    }

}
}