import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
       int numero = 0;
       String agencia = "";
       String nome = "";
       float saldo = 0;

       Scanner teclado = new Scanner(System.in);

       System.out.println("Digite o numero da conta: ");
       numero = teclado.nextInt();

       System.out.println("Digite o numero da agencia: ");
       agencia = teclado.next();

       System.out.println("Digite o nome do cliente: ");
       nome = teclado.next();

       System.out.println("Digite o saldo : ");
       saldo = teclado.nextFloat();

       System.out.println("Conta criada !!!");

       System.out.println("Nome: " + nome);
       System.out.println("Numero: " + numero);
       System.out.println("Agencia: " + agencia);
       System.out.println("Saldo: " + saldo);

    }
}
