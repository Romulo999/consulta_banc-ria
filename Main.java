import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        double saldo = 2000.0;

        while (continuar) {
            System.out.println("""
            *************************************
            
                    Escolha uma opção:
                    1 - Consultar saldo
                    2 - Realizar saque
                    3 - Realizar depósito
                    4 - Sair
                    
            *************************************
                    """);

            int opcao = scanner.nextInt();


            System.out.println("Digite a opção desejada");

            switch (opcao) {

                case 1:
                    System.out.println("seu saldo é de " + saldo);
                    break;


                case 2:
                    System.out.println("Digite o valor que deseja receber");
                    double saque = scanner.nextDouble();
                    double saqueRealizado = saldo - saque;
                    if (saque > saldo) {
                        System.out.println("Você não possui esse saldo, pobre!");
                    } else {
                        System.out.println("saque de " + saque + " realizado! Agora seu saldo é de " + saqueRealizado);
                    }
                    break;

                case 3:
                    System.out.println("Insira o valor que deseja depositar.");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Deposito de " + deposito + "realizado, seu saldo atual é de " + saldo + ".");
                    break;


                case 4:
                    System.out.println("Saindo da consulta.");
                    continuar = false;
                    break;


                default:
                    System.out.println("Está opção não existe.");
                    break;


            }

        }




    }
}
