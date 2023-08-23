import com.br.model.ContaCorrente;
import java.util.Scanner;

/**
 * @author mcnerirj
 */
public class ContaTerminal {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        contaCorrente.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o número da Conta: ");
        contaCorrente.setNumero(Integer.parseInt(scanner.nextLine()));

        System.out.println("Por favor, digite o nome do Cliente: ");
        contaCorrente.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o saldo do Cliente: ");
        contaCorrente.setSaldo(Double.parseDouble(scanner.nextLine()));

        System.out.println(contaCorrente);
    }


}
