import java.util.Scanner;

public class Add 
{
    public static void main(String[] args) 
{
        int firstNumber, secondNumber, sum;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();
        
        scanner.close();
        
        sum = firstNumber + secondNumber;
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum + ".");
    }
}