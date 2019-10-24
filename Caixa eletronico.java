package study1;
//create by Reinaldo Henrique da Cruz Rocha, star this pls .

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        String agencia = "001";
        String conta = "12387-2";
        String senha = "123";

        System.out.println("Programa Caixa Eletrônico");

        Scanner en = new Scanner(System.in);

        String agenciaCliente = "";
        while (! agenciaCliente.equals(agencia)) {
            System.out.println("Agência: ");
            agenciaCliente = en.next();
        }

        String contaCliente = "";
        while (! contaCliente.equals(conta)) {
            System.out.println("Conta corrente: ");
            contaCliente = en.next();
        }

        String senhaCliente = "";
        System.out.println("Senha da conta: ");
        contaCliente = en.next();
        if (contaCliente.equals(conta)) {
            System.err.println("Senha errada. Tente novamente.");
        } else {
            double saldo = 1200.00;
            int operacao = 0;

            while (operacao != 4) {

                System.out.println("Menu");
                System.out.println("1 - Mostrar saldo");
                System.out.println("2 - Realizar saque");
                System.out.println("3 - Realizar depósito");
                System.out.println("4 - Sair");
                operacao = en.nextInt();

                switch (operacao) {
                    case 1:
                        System.out.println("Saldo: R$ " + saldo);
                        break;
                    case 2:
                        System.out.println("Valor do saque: R$ ");
                        double saque = en.nextDouble();
                        if (saque <= saldo) {
                            saldo = saldo - saque;
                            System.out.println("Saldo: R$ " + saldo);
                        } else {
                            System.out.println("ERRO: Saque maior que o saldo.");
                        }
                        break;
                    case 3:
                        System.out.println("Valor do depósito: R$ ");
                        double deposito = en.nextDouble();
                        saldo += deposito;
                        System.out.println("Saldo: R$ " + saldo);
                        break;
                    default:
                        System.err.println("Programa encerrado.");
                }
            }
        }
    }

}
