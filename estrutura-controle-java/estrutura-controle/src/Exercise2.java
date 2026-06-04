import java.util.Scanner;

public class Exercise2 {
    public static void main(String args[]){
        //TODO: Escreva um código onde o usuário entra com sua altura e peso,
        //	seja feito o calculo do seu IMC(IMC = peso/(altura * altura))
        //	e seja exibida a mensagem de acordo com o resultado:
        //
        //	Se for menor ou igual a 18,5 "Abaixo do peso";
        //	se for entre 18,6 e 24,9 "Peso ideal";
        //	Se for entre 25,0 e 29,9 "Levemente acima do peso";
        //	Se for entre 30,0 e 34,9 "Obesidade Grau I";
        //	Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        //	Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

        double altura = 0;
        double peso = 0;
        double imc = 0;

       Scanner input = new Scanner(System.in);

       System.out.println("Digite sua Altura:");
       altura = input.nextDouble();

       System.out.println("Digite seu Peso:");
       peso = input.nextDouble();

       imc = peso / (altura * altura);

       double resultado = Math.round(imc * 100.0) / 100.0;

       System.out.println("Seu IMC é: " + resultado);

       if (resultado < 18.5){
           System.out.println("Você está abaixo do peso");
       } else if (resultado >= 18.5 && resultado <= 24.9){
           System.out.println("Você está no seu peso ideal");
       } else if (resultado >= 25 && resultado <= 29.9){
           System.out.println("Você está levemente acima do peso");
       } else if (resultado >= 30 && resultado <= 34.9){
           System.out.println("Você tem obesidade Grau I");
       } else if (resultado >= 35 && resultado <= 39.9){
           System.out.println("Você tem obesidade Grau II (Severa)");
       } else if (resultado >= 40 && resultado <= 49.9){
           System.out.println("Você tem obesidade Grau III (Mórbida)");
       }
    }
}
