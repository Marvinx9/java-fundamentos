package veiculo;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("\nAcelerando o carro");
    }

    @Override
    public void frear() {
        System.out.println("\nFreando o carro");
    }
}
