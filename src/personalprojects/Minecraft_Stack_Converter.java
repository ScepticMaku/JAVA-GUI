package personalprojects;
import java.util.Scanner;

public class Minecraft_Stack_Converter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack64Convert convert64 = new Stack64Convert();
        Stack16Convert convert16 = new Stack16Convert();
        
        convert16.getStack16();
    }
}
