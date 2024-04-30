import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numero ;
        String agencia ;
        String nomeCliente ;
        double saldo;

        System.out.println("Digite o seu nome?");
        nomeCliente = input.next();
        System.out.println("Digite Sua agencia?");
        agencia = input.next();
        System.out.println("Digite seu numero?");
        numero = input.nextInt();
        System.out.println("Saldo que possui em conta?");
        saldo = input.nextDouble();
        
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque.");
    }
}
