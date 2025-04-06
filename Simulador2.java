import java.util.Scanner;

public class Simulador2 {
    public static void main(String[] args) {

        // FOR

        // Crescente
        for (int cont = 0; cont < 10; cont++) { // 3 condições: inicialização, controle e incremento
            System.out.println(cont + "- Simulador");
        }
        System.out.println("Fim do for.");

        // Decrescente
        for (int cont = 10; cont > 0; cont--) {
            System.out.println(cont + "- Simulador");
        }
        System.out.println("Fim do for decrescente.");

        // WHILE - quando não tenho certeza da quantidade de repetições
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int cont = 0; // inicializar fora
        while (cont < max) {
            System.out.println(cont + "- Simulador");
            cont++;
        }
        System.out.println("Fim do while.");

        // DO WHILE - executa pelo menos uma vez
        cont = 0;
        do {
            System.out.println(cont + "- Simulador");
            cont++;
        } while (cont <= 0);
        System.out.println("Fim - do while.");

        scan.close();
    }
}
