public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(int matricula, String nome, String departamento) {
        super(matricula, nome);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        String txt = super.toString() + "\nDepartamento: " + departamento;
        return txt;
    }

}