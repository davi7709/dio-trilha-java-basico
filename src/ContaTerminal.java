import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int numero;
       String agencia;
       String nome_cliente;
       float saldo;

        System.out.print("Informe a agencia: ");
        agencia = sc.nextLine();
        System.out.print("");

        System.out.print("Informe o numero da conta: ");
        numero = sc.nextInt();
        System.out.print("");

        System.out.print("Informe o seu nome: ");
        nome_cliente = sc.next();
        System.out.print("");

        System.out.print("Informe o seu saldo ");
        saldo = sc.nextFloat();
        System.out.print("");

        System.out.print("Ola " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta" + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");


    }
}