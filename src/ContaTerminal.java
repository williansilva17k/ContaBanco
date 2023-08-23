import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o número de sua conta");
        numero = input.nextInt();

        System.out.println("Informe a agência da conta");
        agencia = input.next();

        System.out.println("Informe o nome do cliente");
        nomeCliente = input.next();

        System.out.println("Informe o saldo da conta");
        saldo = input.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f e já está disponível para transações.\n",
                nomeCliente, agencia, numero, saldo);
    }

}
