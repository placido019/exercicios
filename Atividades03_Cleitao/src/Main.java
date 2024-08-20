import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        String nomeProduto = "Notebook";
        double precoUnitario = 3500.00;
        int quantidadeComprada = 5;
        double taxaImposto = 0.18; // 18%
        double margemLucro = 0.20; // 20%


        double valorTotalSemImpostos = precoUnitario * quantidadeComprada;
        double valorImposto = valorTotalSemImpostos * taxaImposto;
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;
        double precoVendaSugerido = valorTotalComImpostos * (1 + margemLucro);

        //Desafio Extra
        DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");
        String valorTotalComImpostosFormatado = formatoMoeda.format(valorTotalComImpostos);
        String precoVendaSugeridoFormatado = formatoMoeda.format(precoVendaSugerido);


        String mensagemFinal = String.format(
                "Produto: %s%n" +
                        "Valor total com impostos: %s%n" +
                        "Preço de venda sugerido: %s",
                nomeProduto, valorTotalComImpostosFormatado, precoVendaSugeridoFormatado
        );


        System.out.println("------ Detalhes da Operação ------");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Preço unitário: " + formatoMoeda.format(precoUnitario));
        System.out.println("Quantidade comprada: " + quantidadeComprada);
        System.out.println("Valor total sem impostos: " + formatoMoeda.format(valorTotalSemImpostos));
        System.out.println("Valor do imposto: " + formatoMoeda.format(valorImposto));
        System.out.println("Valor total com impostos: " + valorTotalComImpostosFormatado);
        System.out.println("Preço de venda sugerido: " + precoVendaSugeridoFormatado);
        System.out.println();
        System.out.println(mensagemFinal);
    }
}
