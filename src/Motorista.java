public class  Motorista extends Funcionario {

    private String tipoCarteira;

    public Motorista(int matricula, String nome, String tipoCarteira) {
        super(matricula, nome);
        this.tipoCarteira = tipoCarteira;
    }

    public String getTipoCarteira() {
        return tipoCarteira;
    }

    public void setTipoCarteira(String tipoCarteira) {
        this.tipoCarteira = tipoCarteira;
    }

    @Override
    public String toString() {
        String txt = super.toString() + "\\Tipo de Carteira: " + tipoCarteira;
        return txt;
    }
    
}
