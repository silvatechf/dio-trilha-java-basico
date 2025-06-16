
import java.util.Scanner;

public class ContaTerminal {
  
        public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);
    
            int numero;
            String agencia;
            String nomeCliente;
            double saldo;
    
            System.out.println("Por favor, digite o número da conta:");
            numero = scanner.nextInt();
    
            scanner.nextLine();
    
            System.out.println("Por favor, digite o número da Agência:");
            agencia = scanner.nextLine(); 
            System.out.println("Por favor, digite seu nome completo:");
            nomeCliente = scanner.nextLine(); 
            System.out.println("Por favor, digite seu saldo inicial:");
            saldo = scanner.nextDouble(); 
    
            System.out.println(); 

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,\n"
                            + "Sua agência é %s,\n"
                            + "Sua conta é %d,\n"
                            + "e seu saldo de R$%.2f já está disponível para saque.\n",
                    nomeCliente, agencia, numero, saldo);
    
            scanner.close();
        }
    }
