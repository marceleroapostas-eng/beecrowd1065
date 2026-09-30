
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int pares = 0;

        for (int i = 0; i < 5; i++) {
            int numero = leitor.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }
        }
        System.out.println(pares + " valores pares");
        leitor.close();
    }
}
