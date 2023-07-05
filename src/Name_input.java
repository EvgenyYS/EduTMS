import java.util.Scanner;

public class Name_input
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name; // creating variable NAME
        System.out.println("Hello, please enter name: "); // request for variable input
        name = scanner.next(); // reading variable from input
        System.out.println("Hello " + name); // exporting out variable NAME

    }
}
