package excecoes;

public class Excecoes {
    public static void main(String[] args) {
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro!" + e.getMessage());
        }
    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if(numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }
}
