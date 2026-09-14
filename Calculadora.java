package Calculadora;
import java.util.Scanner;

public class Calculadora {
    int num1,num2;
    double resultado;
    int opcao;
   public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção...");
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        calculadora.opcao = scanner.nextInt();
        System.out.println("Digite o primeiro numero...");
        calculadora.num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero...");
        calculadora.num2 = scanner.nextInt();

        Calcular calcular = new Calcular();

        calcular.num1 = calculadora.num1;
        calcular.num2 = calculadora.num2;
        calcular.opcao = calculadora.opcao;

        calcular.calcular();
    }
}
