import java.io.Console;

public class Sistema{

    public static void exibirMenu(){

        System.out.println("\nCADASTRO DE FUNCIONÁRIO - MENU");
        System.out.println("1) Cadastrar gerente");
        System.out.println("2) Cadastrar motorista");
        System.out.println("3) Cadastrar atendente");
        System.out.println("4) Listar todos os funcionários");
        System.out.println("5) Listar só os gerentes");
        System.out.println("6) Listar só os motoristas");
        System.out.println("7) Listar só os atendentes");
        System.out.println("8) Remover funcionário");
        System.out.println("0) Sair");
        System.out.println("\nInforme uma opção");
        
    }

    private static void verificarOpção (int op){
        
        String nome;
        int matricula;

        switch (op) {
            case 1:

                System.out.println("\nCADASTRO DE GERENTE:");
                System.out.print("Nome: ");
                nome = Console.lerString();
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();
                System.out.print("Departamento ");
                String departamento = Console.lerString();

                gerente gerente = new Gerente(nome, matricula, departamento);
                CadastroFuncionarios.cadastrar(gerente);

                System.out.println("\nGerente cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nCADASTRO DE MOTORISTA:");
                System.out.print("Nome: ");
                nome = Console.lerString();
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();
                System.out.print("Tipo de Carteira: ");
                String TipodeCarteira = Console.lerString();

                Motorista motorista = new Motorista(nome, matricula, TipodeCarteira);
                CadastroFuncionarios.cadastrar(motorista);

                System.out.println("\nMotorista cadastrado com sucesso!");

                break;

            case 3:

                System.out.println("\nCADASTRO DE ATENDENTE:");
                System.out.print("Nome: ");
                nome = Console.lerString();
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();
                System.out.print("Turno ");
                String turno = Console.lerString();

                atendente atendente = new Atendente(nome, matricula, turno);
                CadastroFuncionarios.cadastrar(atendente);

                System.out.println("\nAtendente cadastrado com sucesso!");
            
            case 4:

                if (CadastroFuncionarios.getListaFuncionarios().size() == 0) {
                 System.out.println("Não há funcionários cadastrados...");
                 break;
                }
        
                 System.out.println("\nFUNCIONÁRIOS CADASTRADOS:");
                 for (Funcionario tempFuncionario : CadastroFuncionarios.getListaFuncionarios()) {
                    System.out.println(tempFuncionario);
                }

            break;
            } 

            case 5:

                System.out.println("\nGERENTES CADASTRADOS:");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getGerentes()) {
                System.out.println(tempFuncionario);
            }

            break;

            case 6:

              System.out.println("\nMOTORISTAS CADASTRADOS:");
              for (Funcionario tempFuncionario : CadastroFuncionarios.getListaFuncionarios()) {
                
                if(tempFuncionario instanceof Motorista) {
                    System.out.println(tempFuncionario);
                }

            }

            case 7:

               System.out.println("\nATENDENTES CADASTRADOS:");
               for (Funcionario tempFuncionario : CadastroFuncionarios.getListaFuncionarios()) {
                
                if(tempFuncionario instanceof atendente) {
                    System.out.println(tempFuncionario);
                }

                break;
            
            case 8;
            
               System.out.println("\nREMOVER FUNCIONÁRIO");
               System.out.print("Informe a matícula do funcionário: ");
               matricula = Console.lerInt();

                if (CadastroFuncionarios.excluir(matricula)){
                 System.out.println("\nFuncionário foi rmeovido com sucesso!");
                } else {
                System.out.println("\nFuncionário " + matricula + " não localizado no cadastro");
            }

            break;

            case 0:

                System.out.println("\nO Sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        
        }

        System.out.println();

    }

    public static void executar() {
        
        int op;

        do{

            exibirMenu();
            op = Console.lerInt();
            verificarOpção(op);
        } while (op ! = 0);
    }




}
