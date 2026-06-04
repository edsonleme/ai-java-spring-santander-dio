import java.util.Scanner;

public class Exercise2 {
    public static void main (String[] args){
        //TODO: Escreva um código que recebe o tamanho do lado de um quadrado,
        // calcule a área e exiba na tela.
        // formula: area = lado x lado

        int side;
        int area;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        side = input.nextInt();

        area = side * side;

        System.out.println("The area of the square is: " + area);

    }
}
