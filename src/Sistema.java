public class Sistema {


    private static void exibirMenuPrincipal() {

        System.out.println("\nCaçambas Renovar - Cadastro de Funcionário\n");
        System.out.println("[1] - Cadastrar gerente");
        System.out.println("[2] - Cadastrar motorista");
        System.out.println("[3] - Cadastrar atendente");
        System.out.println("[4] - Listar todos os funcionários");
        System.out.println("[5] - Listar gerentes");
        System.out.println("[6] - Listar motoristas");
        System.out.println("[7] - Listar atendentes");
        System.out.println("[8] - Editar funcionário");
        System.out.println("[9] - Remover funcionário");
        System.out.println("[10] - Remover todos os funcionários");
        System.out.println("[0] - Sair");
        System.out.print("\nInforme uma Opção: ");
        
    }

    private static void exibirMenuEditar(int matricula) {
        System.out.println("\nEditar " + matricula);
        System.out.println("[1] - Editar gerente");
        System.out.println("[2] - Editar motorista");
        System.out.println("[3] - Editar atendente");
        System.out.println("[0] - Sair");
        System.out.print("\nInforme uma Opção: ");
    }

    private static void cadastrarFuncionarios(String cargo) {

        System.out.println("\nCadastro de " + cargo);
        
        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();
        
        System.out.print("Nome: ");
        String nome = Console.lerString();

        if (cargo == "Gerente") {
            System.out.print("Departamento: ");
            String departamento = Console.lerString();
            
            Gerente gerente = new Gerente(matricula, nome, departamento);
            
            CadastroFuncionarios.cadastrar(gerente);
        }

        if (cargo == "Motorista") {
            System.out.print("Tipo de CNH: ");
            String tipoCNH = Console.lerString();
            
            Motorista motorista = new Motorista(matricula, nome, tipoCNH);
            
            CadastroFuncionarios.cadastrar(motorista);
        }

        if (cargo == "Atendente") {
            System.out.print("Turno: ");
            String turno = Console.lerString();
            
            Atendente atendente = new Atendente(matricula, nome, turno);
            
            CadastroFuncionarios.cadastrar(atendente);
        }

        System.out.println("\n" + cargo + " cadastrado com sucesso!");
    }

    private static void editarFuncionarios(String cargo, int matricula) {

        System.out.println("\nEditar " + matricula);
        
        System.out.print("Nome: ");
        String nome = Console.lerString();

        if (cargo == "Gerente") {
            System.out.print("Departamento: ");
            String departamento = Console.lerString();
            
            Gerente gerente = new Gerente(matricula, nome, departamento);

            if (CadastroFuncionarios.editar(matricula, gerente)) {
                System.out.println("\n" + matricula + " editado com sucesso!");
            } else {
                System.out.println("\nOcorreu um erro ao editar " + matricula + "!" );
            }
        }

        if (cargo == "Motorista") {
            System.out.print("Tipo de CNH: ");
            String tipoCNH = Console.lerString();
            
            Motorista motorista = new Motorista(matricula, nome, tipoCNH);
            
            if (CadastroFuncionarios.editar(matricula, motorista)) {
                System.out.println("\n" + matricula + " editado com sucesso!");
            } else {
                System.out.println("\nOcorreu um erro ao editar " + matricula + "!" );
            }
        }

        if (cargo == "Atendente") {
            System.out.print("Turno: ");
            String turno = Console.lerString();
            
            Atendente atendente = new Atendente(matricula, nome, turno);
            
            if (CadastroFuncionarios.editar(matricula, atendente)) {
                System.out.println("\n" + matricula + " editado com sucesso!");
            } else {
                System.out.println("\nOcorreu um erro ao editar " + matricula + "!" );
            }
        }

    }

    private static void verificarOpcaoMenuPrincipal(int opcao) {

        int matricula;

        switch (opcao) {
            case 1:
                cadastrarFuncionarios("Gerente");
                break;

            case 2:
                cadastrarFuncionarios("Motorista");
                break;

            case 3:
                cadastrarFuncionarios("Atendente");
                break;
            
            case 4:
                if (CadastroFuncionarios.getListaFuncionarios().size() == 0) {
                    System.out.println("\nNão há funcionários cadastrados...");
                    break;
                }
        
                System.out.println("\nFuncionários cadastrados: ");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getListaFuncionarios()) {
                    System.out.println(tempFuncionario);
                }

                break;

            case 5:
                if (CadastroFuncionarios.getGerentes().size() == 0) {
                    System.out.println("\nNão há gerentes cadastrados...");
                    break;
                }

                System.out.println("\nGerentes cadastrados: ");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getGerentes()) {
                    System.out.println(tempFuncionario);
                }

                break;
            
            case 6:
                if (CadastroFuncionarios.getMotoristas().size() == 0) {
                    System.out.println("\nNão há motoristas cadastrados...");
                    break;
                }

                System.out.println("\nMotoristas cadastrados: ");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getMotoristas()) {
                    System.out.println(tempFuncionario);
                }

                break;
            
            case 7:
                if (CadastroFuncionarios.getAtendentes().size() == 0) {
                    System.out.println("\nNão há atendentes cadastrados...");
                    break;
                }

                System.out.println("\nAtendentes cadastrados: ");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getAtendentes()) {
                    System.out.println(tempFuncionario);
                }

                break;
            
            case 8:
                System.out.println("\nEditar funcionário");
                System.out.print("Informe a matrícula do funcionário: ");
                matricula = Console.lerInt();

                int opcaoEditar;

                do {
                    exibirMenuEditar(matricula);
                    opcaoEditar = Console.lerInt();
                    verificarOpcaoMenuEditar(opcaoEditar, matricula);

                } while (opcaoEditar != 0);

                break;
            
            case 9:
                System.out.println("\nRemover funcionário");
                System.out.print("Informe a matrícula do funcionário: ");
                matricula = Console.lerInt();

                if (CadastroFuncionarios.excluir(matricula)){
                    System.out.println("\nFuncionário removido com sucesso!");
                } else {
                    System.out.println("\nFuncionário " + matricula + " não localizado no cadastro");
                }

                break;
      
            case 10:
                System.out.println("\nRemover Todos os Funcionários");

                if (CadastroFuncionarios.getListaFuncionarios().size() == 0) {
                    System.out.println("\nNão há funcionários cadastrados...");
                    break;
                }
                
                if (CadastroFuncionarios.excluirTodos()){
                    System.out.println("\nFuncionários removidos com sucesso!");
                } else {
                    System.out.println("\nOcorreu um erro ao excluir os funcionários!");
                }

                break;
            
            case 0:
                System.out.println("\nO Sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        
        }

    }

    private static void verificarOpcaoMenuEditar(int opcaoEditar, int matricula) {
        switch(opcaoEditar) {
            case 1:
                editarFuncionarios("Gerente", matricula);
                break;
            case 2:
                editarFuncionarios("Motorista", matricula);
                break;
            case 3:
                editarFuncionarios("Atendente", matricula);
                break;
            case 0:
                System.out.println("\nA edição foi finalizada...");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }

    public static void executar() {
        
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = Console.lerInt();
            verificarOpcaoMenuPrincipal(opcao);
        } while (opcao != 0);
    }
}
