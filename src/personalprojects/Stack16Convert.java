package personalprojects;
import java.util.Scanner;

public class Stack16Convert {
    public void getStack16(){
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter the total number of items: ");
        num = input.nextInt();
        
        final int STACK_SIZE = 16;
        
        int MAX_STACK = num/STACK_SIZE;
        int REM_ITEMS = num%STACK_SIZE;
        
        System.out.println("Total stack size of "+STACK_SIZE+": "+MAX_STACK);
        System.out.println("Remaining items: "+REM_ITEMS);
        System.out.println("Total Items: "+num);
    }
}
