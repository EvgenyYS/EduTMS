import java.util.Scanner;

public class Number_Check
{
    public static void main(String[] args)
    {
        int nmb; // creating variable Number
        System.out.println("Hello, please enter number: "); // request for variable input
        Scanner input = new Scanner(System.in);
        nmb = input.nextInt();

        if (nmb % 2 == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The Number is odd");

    }
}
