package people;

public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    String imprimirDadosDaPessoa() {
        System.out.println(super.imprimirDadosDaPessoa());
        return "Você é Aluno";
    }
}
