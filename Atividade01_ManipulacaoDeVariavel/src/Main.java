public class Main {
    public static void main(String[] args) {

        int idade = 18;
        double altura = 1.73;
        String nome = "Joao Pedro";
        boolean estudante = true;

        int idade2 = 38;
        double altura2 = 1.54;
        String nome2 = "Silvia"; //'String' com 'S' maiúsculo
        boolean estudante2 = false;

        int somaIdades = idade + idade2;

        double alturaFinal = altura * 2;

        System.out.println("Bem-vindo ao sistema de cadastro " + nome);

        System.out.println(); //'System.out.println'
        System.out.println("-------Dados da primeira pessoa------");
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome);
        if (estudante) {
            System.out.println("Você é estudante");
        } else {
            System.out.println("Não é estudante");
        }
        System.out.println();

        System.out.println("------ Dados da segunda pessoa ------");
        System.out.println("Idade: " + idade2);
        System.out.println("Altura: " + altura2);
        System.out.println("Nome: " + nome2);
        if (!estudante2) {
            System.out.println("Não é estudante");
        } else {
            System.out.println("Você é estudante");
        }
        System.out.println();
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println();
        System.out.println("Altura multiplicada por dois: " + alturaFinal);
    }
}
