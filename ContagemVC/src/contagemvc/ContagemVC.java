
package contagemvc;

import java.util.Scanner;

public class ContagemVC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase();

        int vogais = 0;
        int consoantes = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if (Character.isLetter(c)) { // ignora números, espaços e símbolos
                if ("aeiou".indexOf(c) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de consoantes: " + consoantes);
    }
    
}
