import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


// OBJETIVO: produzir uma calculadora por meio de funções java.

// Variável:

        double x, y;
        int escolha, continuar;

// Looping de continuação:


// Solicitação p usuário (números):

        System.out.println("Olá! Digite os dois números que você deseja utilizar para realizar a operação. \n1° Número: ");
        x = leia.nextDouble();
        System.out.println("\n2° Número: ");
        y = leia.nextDouble();

// Solicitação p usuário (operação):

        System.out.println("Qual das operações você deseja realizar? \n1 -> Soma \n2 -> Subtração \n3 -> Multiplicação \n4 -> Divisão");
        escolha = leia.nextInt();

// Execução da escolha:

        switch (escolha) {
            case 1:
                System.out.println("A soma entre os números " + x + " e " + y + " Resulta em: " + (Operacoes.somar(x, y) ) );
            case 2:
                System.out.println("A subtração entre os números " + x + " e " + y + " Resulta em: " + (Operacoes.subt(x, y) ) );
            case 3:
                System.out.println("A multiplicação entre os números " + x + " e " + y + " Resulta em: " + (Operacoes.mult(x, y) ) );
            case 4:
                System.out.println("A divisão entre os números " + x + " e " + y + " Resulta em: " + (Operacoes.divi(x, y) ) );
        }

// Solicitação p usuário (continuar?):

        System.out.println("Você deseja realizar outra operação? \n 1 -> Sim \n2 -> Não");
        continuar = leia.nextInt();




        }

    }
}