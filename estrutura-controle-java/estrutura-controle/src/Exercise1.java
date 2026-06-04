import java.util.Scanner;

public class Exercise1 {
    public static void main(String args[]){
        //TODO: Escreva um código onde o usuário entra com um número e
        //	seja gerada a tabuada de 1 até 10 desse número;

        int number = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Type one number to generate your multiplications: ");
        number = scan.nextInt();

        System.out.println("Tabuada do " + number);
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " x " + number + " = " + (number * i));
        }
    }
}

