public class  Motorista extends Funcionario {

    private String tipoCNH;

    public Motorista(int matricula, String nome, String tipoCNH) {
        super(matricula, nome);
        this.tipoCNH = tipoCNH;
    }

    public String getTipoCNH() {
        return tipoCNH;
    }

    public void setTipoCNH(String tipoCNH) {
        this.tipoCNH = tipoCNH;
    }

    @Override
    public String toString() {
        String txt = super.toString() + "\nTipo de CNH: " + tipoCNH;
        return txt;
    }
    
}
