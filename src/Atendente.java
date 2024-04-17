public class Atendente extends Funcionario {

    private String turno;

    public Atendente(int matricula, String nome, String turno) {
        super(matricula, nome);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }


    @Override
    public String toString() {
        String txt = super.toString() + "\nTurno: " + turno;
        return txt;
    }
    
}