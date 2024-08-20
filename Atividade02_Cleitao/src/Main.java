public class Main {
    public static void main(String[] args) {
        String nome = "Joao Pedro";
        int idade = 18;
        double salarioBruto = 1550.72;

        //Meses trabalhados em um ano, sim nosso funcionário nao folgou no ano ;-;
        int mesesTrabalhados = 12;

        //Produtos comprados na loja imaginária
        int produtosComprados = 3;

        double salarioAnualBruto = (salarioBruto * mesesTrabalhados);

        //2 mil de imposto juntando os 12 meses
        double salarioAnualLíquido = salarioAnualBruto - 2.000;
        double salarioLiquido = salarioAnualLíquido / 12;

        double precoProduto1 = 547.53;
        double precoProduto2 = 128.56;
        double precoProduto3 = 320.49;

        double mediaValorProdutos = (precoProduto1 + precoProduto2 + precoProduto3) / produtosComprados;

        System.out.println("------ Saida dos dados ------");

        System.out.println("Seus dados são => Nome: " + nome + "Salário líquido: " + salarioLiquido);

        System.out.println("Saída dos outros dados: ");
        System.out.println("Nome" + nome);
        System.out.println("Idade" + idade);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Meses trabalhados em um ano: " + mesesTrabalhados);
        System.out.println("Salario liquido " + salarioLiquido);
        System.out.println("Salário anual: " + salarioAnualLíquido);
        System.out.println("Preço do produto 1 -> " + precoProduto1);
        System.out.println("Preço do produto 2 -> " + precoProduto2);
        System.out.println("Preço produto 3 -> " + precoProduto3);

    }
}