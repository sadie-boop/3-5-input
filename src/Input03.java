import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("Enter 3 numbers separated by a single spaces: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Sum of numbers entered: " + (num1 + num2 + num3));


        
        
        //Remember to close the Scanner
        sc.close();
    }
}
