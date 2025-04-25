public class FatorialExemplos {

    //versão iterativa
    public static int fatorialIterativo(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    //versão recursiva
    public static int fatorialRecursivo(int n) {
        if (n == 0)
            return 1;
        else
            return n * fatorialRecursivo(n - 1);
    }
    
    public static void main(String[] args) {
        int n = 3;

        System.out.println("Fatorial Iterativo de " + n + ": " + fatorialIterativo(n));
        System.out.println("Fatorial Recursivo de " + n + ": " + fatorialRecursivo(n));
    }
}