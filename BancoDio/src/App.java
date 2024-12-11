import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerBanco = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scannerBanco.next();
        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = scannerBanco.next();
        scannerBanco.close();
        ContaTerminal contaTerminal = new ContaTerminal(1, agencia, nomeCliente, 150.5);
        System.out.println("Olá " + contaTerminal.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.getAgencia() + ", conta " + contaTerminal.getNumero() + " e seu saldo " + contaTerminal.getSaldo() + " já está disponível para saque");
    }
}
