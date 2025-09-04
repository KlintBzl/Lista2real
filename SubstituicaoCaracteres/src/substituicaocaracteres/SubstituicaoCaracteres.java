
package substituicaocaracteres;

import java.util.Scanner;


public class SubstituicaoCaracteres {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase para o programa fazer sua mágica");
        String f = scanner.nextLine();
        
        String F = f.replace("a", "*");
        
        System.out.println("Frase modificada: " + "'" + F + "'");
    }
    
}
