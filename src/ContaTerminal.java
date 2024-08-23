import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner meuObjeto = new Scanner(System.in); // instanciando a classe Scanner

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = meuObjeto.nextLine();

        System.out.println("Por favor, digite o número da sua agência ");
        String numeroAgencia = meuObjeto.nextLine();

        System.out.println("Por favor, digite o número de sua conta: ");
        int numeroConta = meuObjeto.nextInt();

        System.out.println("Por favor, digite o saldo de sua conta: ");
        double saldoConta = meuObjeto.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, " + "sua agência é " +
                numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldoConta + " já está disponível para saque.");
    }
}