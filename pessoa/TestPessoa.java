package pessoa;

public class TestPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.cpf = "33322211544";
        pessoa.nome = "Joao";
        pessoa.idade = 24;

        System.out.println(pessoa.imprimirDadosDaPessoa());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "77788899954";
        pessoa2.nome = "Maria";
        pessoa2.idade = 26;

        System.out.println(pessoa2.imprimirDadosDaPessoa());
    }
}
