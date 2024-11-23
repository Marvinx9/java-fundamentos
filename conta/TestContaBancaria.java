package conta;

public class TestContaBancaria {
    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("123123");
        contaBancaria1.setTitular("João") ;
        contaBancaria1.setSaldo(100);

        contaBancaria1.depositar(50);
        contaBancaria1.sacar(100);
    }
}
