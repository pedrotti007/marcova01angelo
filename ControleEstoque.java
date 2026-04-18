import java.util.Scanner;
import java.util.Locale;

public class ControleEstoque {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

       
        String nomeProduto = scanner.nextLine();
        double preco = scanner.nextDouble();
        int estoqueInicial = scanner.nextInt();
        int quantidadeVendida = scanner.nextInt();

        
        System.out.println("Produto: " + nomeProduto);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque antes da venda: " + estoqueInicial + " unidades");
        System.out.println("Venda realizada: " + quantidadeVendida + " unidades");

        if (quantidadeVendida > estoqueInicial) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            int estoqueAtualizado = estoqueInicial - quantidadeVendida;
            System.out.println("Estoque atualizado: " + estoqueAtualizado + " unidades");
        }

        scanner.close();
    }
}
