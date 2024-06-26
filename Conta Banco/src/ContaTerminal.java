//importando Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o ojeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //definindo retornos
        System.out.println("Digite seu nome abaixo:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome abaixo:");
        String sobrenomeCliente = scanner.next();        

        System.out.println("Digite abaixo o numero de sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite abaixo o numero de sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Seu saldo ataul é de:");
        double saldo = scanner.nextDouble();

        //frase de impressão
        System.out.println("Ola " + nomeCliente+ " " + sobrenomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " +agencia + ", conta " +numeroConta + " e seu saldo " +saldo + " já está disponivél para saque.");
        
    }
}
