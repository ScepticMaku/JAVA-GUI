package personalprojects;

import java.util.Scanner;

public class Stack64Convert {
    public void getStack64(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total number of items: ");
        int totalItems = scanner.nextInt();
        
        // Constants
        final int STACK_SIZE = 64;
        
        // Calculate the number of full stacks and the remaining items
        int fullStacks = totalItems / STACK_SIZE;
        int remainingItems = totalItems % STACK_SIZE;
        
        // Output results
        System.out.println("Total full stacks of " + STACK_SIZE + ": " + fullStacks);
        System.out.println("Remaining items: " + remainingItems);
        System.out.println("Total number of items: " + totalItems);
        
        // Close the scanner
        scanner.close();
    }
}
