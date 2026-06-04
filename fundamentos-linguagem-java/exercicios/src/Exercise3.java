import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //TODO: Escreva um código que receba a base e a altura de um retângulo,
        // calcule sua área e exiba na tela.
        // formula: area = base x altura

        int base;
        int height;
        int area;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base of the square: ");
        base = scan.nextInt();
        System.out.print("Enter the height of the square: ");
        height = scan.nextInt();

        area = height * base;
        System.out.println("The area of the square is: " + area);


    }

}
