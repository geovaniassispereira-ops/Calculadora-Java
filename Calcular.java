package Calculadora;

public class Calcular extends Calculadora {
    public void calcular(){
        switch (opcao){
            case 1:
            resultado = num1+num2;
            System.out.println(resultado);
            break;
            case 2:
                resultado = num1-num2;
                System.out.println(resultado);
                break;
            case 3:
                resultado = num1*num2;
                System.out.println(resultado);
                break;
            case 4:
                resultado = num1/num2;
                System.out.println(resultado);
                break;

        }
}
}