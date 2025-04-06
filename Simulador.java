public class Simulador {

    static void loopSimples(int n) {
        System.out.println("loop simples:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void loopAninhado(int n) {
        System.out.println("loop aninhado:");
        for (int i = 0; i < n; i++) {  //aqui é a linha
            for (int j = 0; j < n; j++) { //aqui é a coluna
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println(" "); //para pular linha 
        }
    }

    static int recursaoLinear(int n) {
        if (n == 0) return 0;
        return 1 + recursaoLinear(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;

        loopSimples(n);
        loopAninhado(n);

        System.out.println("recursão linear:");
        int resultado = recursaoLinear(n);
        System.out.println("resultado: " + resultado);
        System.out.println(" ");
    }
}
