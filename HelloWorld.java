public class HelloWorld {
    public static void main(String[] args) {
     
        // int dadoDoTipoInteiro = 10;
        // double dadoDoTipoDouble = 3.14;
        // float dadoDoTipoFload = 3.14f;
        // long dadoDoTipoLong = 14814861461L;
        // String dadoDoTipoString = "Tipo de dado string";
        // boolean dadoDoTipoBoolean = true;

        // if(dadoDoTipoInteiro == 11) {
        //     System.out.println("Entrou no if");
        // } else if (dadoDoTipoInteiro == 12) {
        //     System.out.println("Entrou no if igual a 12");
        // } else {
        //     System.out.println("Entrou no else");
        // }

        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial ++;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("O valor do i e:" + i);
        }
    }
}