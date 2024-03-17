import java.util.Scanner;

public class ContaTerminal {
    
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.print("Por favor, digite o número da Conta: ");
        conta.numero = sc.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        conta.agencia = sc.next();

        System.out.print("Por favor, digite o seu nome: ");
        sc.nextLine(); // Consumir a quebra de linha pendente
        conta.nomeCliente = sc.nextLine(); // Lê o nome completo

        System.out.print("Por favor, digite o seu saldo: ");
        conta.saldo = sc.nextDouble();

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo de R$" + conta.saldo + " já está disponível para saque.");
    }
}

