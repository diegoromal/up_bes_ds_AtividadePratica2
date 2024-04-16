import java.util.ArrayList;
import java.util.List;

public class CadastroFuncionarios {

    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario func) {
        listaFuncionarios.add(func);
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static boolean excluir(int matricula) {
        for (Funcionario tempFuncionario : listaFuncionarios) {
            if (tempFuncionario.getMatricula() == matricula) {
                listaFuncionarios.remove(tempFuncionario);
                return true;
            }
        }
        return false;
    }

    public static void excluirTodos() {
        listaFuncionarios.clear();
    }

    public static boolean editar(int matricula, Funcionario novoFuncionario) {
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            Funcionario funcionario = listaFuncionarios.get(i);
            if (funcionario.getMatricula() == matricula) {
                listaFuncionarios.set(i, novoFuncionario);
                return true;
            }
        }
        return false;
    }
    
    
}
