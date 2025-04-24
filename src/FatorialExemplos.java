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

    //versão monolítica
    public static int fatorialMonolitico(int n) {
        int resultado = 1;
        int i = 1;
        int estado = 0;

        // Simulação de goto
        while (true) {
            switch (estado) {
                case 0: //estado de verificação
                    if (i > n) {
                        estado = 2;
                        break;
                    }
                    estado = 1;
                    break;
                case 1: // estado de multiplicação
                    resultado *= i;
                    i++;
                    estado = 0;
                    break;
                case 2: //Rx
                    return resultado;
            }
        }
    }
    
    public static void main(String[] args) {
        int n = 3;

        System.out.println("Fatorial Iterativo de " + n + ": " + fatorialIterativo(n));
        System.out.println("Fatorial Recursivo de " + n + ": " + fatorialRecursivo(n));
        System.out.println("Fatorial Monolítico de " + n + ": " + fatorialMonolitico(n));
    }
}