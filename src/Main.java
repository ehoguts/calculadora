import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println("Bem vindo a calculadora!");
        System.out.println("Escolha o tipo de operação você deseja fazer fazer pelo seu respectivo símbolo: ");

        Scanner sc = new Scanner(System.in);
        String operador;
        double valor1;
        double valor2;
        double resultado;

        operador = sc.next();

        if (operador.equals("*")) {
            System.out.println("Certo! Agora insira os valores desejados.\nEscolha o primeiro valor: ");
            if (sc.hasNextDouble()) {
                valor1 = sc.nextDouble();
                System.out.println("Escolha o segundo valor: ");
                if (sc.hasNextDouble()) {
                    valor2 = sc.nextDouble();
                    resultado = valor1 * valor2;
                    System.out.printf("A multiplicação dos valores é: %.2f", resultado);
                } else {
                    System.out.print("O valor inserido é inválido.");
                    System.exit(0);
                }
            } else {
                System.out.println("O valor inserido não é válido.");
                System.exit(0);
            }
        } else if (operador.equals("-")) {
            System.out.println("Certo! Agora insira os valores desejados. \nEscolha o primeiro valor: ");
            if (sc.hasNextDouble()) {
                valor1 = sc.nextDouble();
                System.out.println("Escolha o segundo valor: ");
                if (sc.hasNextDouble()) {
                    valor2 = sc.nextDouble();
                    resultado = valor1 - valor2;
                    System.out.printf("A subtração dos valores é: %.2f", resultado);
                } else {
                    System.out.print("O valor inserido é inválido.");
                    System.exit(0);
                }
            } else {
                System.out.println("O valor inserido não é válido.");
                System.exit(0);
            }
        } else if (operador.equals("%")) {
            System.out.println("Certo! Agora insira os valores desejados. \nEscolha o primeiro valor: ");
            if (sc.hasNextDouble()) {
                valor1 = sc.nextDouble();
                System.out.println("Escolha o segundo valor: ");
                if (sc.hasNextDouble()) {
                    valor2 = sc.nextDouble();
                    resultado = valor1 % valor2;
                    System.out.printf("A divisão dos valores é: %.2f", resultado);
                } else {
                    System.out.print("O valor inserido é inválido.");
                    System.exit(0);
                }
            } else {
                System.out.println("O valor inserido não é válido.");
                System.exit(0);
            }
        } else if (operador.equals("+")) {
            System.out.println("Certo! Agora insira os valores desejados. \nEscolha o primeiro valor: ");
            if (sc.hasNextDouble()) {
                valor1 = sc.nextDouble();
                System.out.println("Escolha o segundo valor: ");
                if (sc.hasNextDouble()) {
                    valor2 = sc.nextDouble();
                    resultado = valor1 + valor2;
                    System.out.printf("A adição dos valores é: %.2f", resultado);
                } else {
                    System.out.print("O valor inserido é inválido.");
                    System.exit(0);
                }
            } else {
                System.out.println("O valor inserido não é válido.");
                System.exit(0);
            }
        } else {
            System.out.print("O símbolo inserido é inválido.");
        }
    }

}