public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joao", 1234);
        System.out.println(f1.toString());

        Gerente g1 = new Gerente("Marcos", 4321, "A");

        System.out.println(g1.toString());
        }
}
