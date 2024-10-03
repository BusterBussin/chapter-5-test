import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int x;
        int y;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first number");
        x = keyboard.nextInt();
        System.out.println("Enter the second number");
        y = keyboard.nextInt();
        keyboard.close();
        int add = x + y;
        int sub = x - y;
        System.out.println("Addition result: " + add);
        System.out.println("Subtraction result: "+ sub);
        System.exit(0);
    }
}