import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //TODO: Escreva um código que receba o nome e a idade de 2 pessoas
        // e imprima a diferença entre eles.

        String namePerson1;
        String namePerson2;
        int agePerson1;
        int agePerson2;
        int difference;

        Scanner scanP1 = new Scanner(System.in);
        System.out.print("Enter the name of the first person: ");
        namePerson1 = scanP1.nextLine();

        System.out.print("Enter the age of the first person: ");
        agePerson1 = scanP1.nextInt();

        Scanner scanP2 = new Scanner(System.in);
        System.out.print("Enter the name of the second person: ");
        namePerson2 = scanP2.nextLine();

        System.out.print("Enter the age of the second person: ");
        agePerson2 = scanP2.nextInt();

        difference = (agePerson1 - agePerson2);

        System.out.println("The difference between " + namePerson1 + " and " + namePerson2
                + " is " + difference + " years old!");

    }







}
