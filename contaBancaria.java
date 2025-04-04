//by:
//instagram: @rickk1st
//linkedin: richard-freitas
//github: vlonerickk
//contact: richard.rcket@gmail.com



//Esse é um desafio proposto no curso de JAVA da alura, nele irei mostrar todos meus aprendizados na prática.
import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 1000;
        int opcoes = 0;

        while (true){
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Realizar transferência.");
            System.out.println("3. Receber transferência.");
            System.out.println("4. Sair.");

            opcoes = leitor.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Valor para transferir: R$");
                    double valorTransferido = leitor.nextDouble();
                    if (valorTransferido < saldo){
                        saldo -= valorTransferido;
                        System.out.println("Saldo atual: R$" + saldo);
                    }else {
                        System.out.println("Valor insuficiente para transferência");
                    }
                    break;
                case 3:
                    System.out.println("Valor a receber: R$ ");
                    double valorRecebido = leitor.nextDouble();
                    System.out.println("Saldo atual: R$" + (valorRecebido + saldo));
                    break;
                case 4:
                    System.out.println("Deseja sair? S/N:");
                    String respota = leitor.next().trim();
                    if (respota.equalsIgnoreCase("S")){
                        System.out.println("Saindo...");
                        leitor.close();
                        return;
                    }else if (respota.equalsIgnoreCase("N")){
                        System.out.println("Voltando para o menu...");
                    }else {
                        System.out.println("Digite S para sair ou N para continuar.");
                    }break;
                    default:
                        System.out.println("Opção invalida, tente novamente!");
                        break;
            }
        }
    }
}