package people;

public class TestPessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("33322211544");
        professor.setNome( "Joao");
        professor.setIdade(24);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());
    
        Aluno aluno = new Aluno();
        aluno.setCpf("45678945622");
        aluno.setNome("Joaozinho");
        aluno.setIdade(17);
        aluno.setMatricula("588489");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
