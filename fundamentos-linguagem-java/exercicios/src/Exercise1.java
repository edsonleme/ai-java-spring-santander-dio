import java.time.LocalDate;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //TODO: Escreva um código que recebe o nome e o ano de nascimento de alguém
        // e imprima na tela a seguinte mensagem: Olá, (nome), você tem x anos.

        //variable declarations
        String name;
        int birthYear;
        int age;

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your Name: ");
        name = reader.nextLine();
        System.out.println("Type your year birth: ");
        birthYear = reader.nextInt();

        LocalDate localDate = LocalDate.now();
        int systemYear = localDate.getYear();

        age = systemYear - birthYear;
        System.out.println("Hello " + name + ", you have " + age + " years old.");
    }
}