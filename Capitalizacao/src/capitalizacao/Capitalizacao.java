
package capitalizacao;

import java.util.Scanner;

public class Capitalizacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        // Quebra o nome em palavras
        String[] palavras = nome.split(" ");

        StringBuilder nomeFormatado = new StringBuilder();

        for (String p : palavras) {
            if (!p.isEmpty()) { // evita espaços extras
                String primeiraLetra = p.substring(0, 1).toUpperCase();
                String resto = "";
                if (p.length() > 1) {
                    resto = p.substring(1).toLowerCase();
                }
                nomeFormatado.append(primeiraLetra).append(resto).append(" ");
            }
        }

        System.out.println("Nome formatado: " + nomeFormatado.toString().trim());
    }
    
}
