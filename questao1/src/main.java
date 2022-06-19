import java.sql.SQLException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws SQLException {

        Conexão conexao = new Conexão();
        //Strings
        Produto produto1 = new Produto("Coca-Cola", "Zero", 2, 1.99);
        Produto produto2 = new Produto("Fanta", "Uva", 5, 1.50);
        Produto produto3 = new Produto("Guaraná", "Açúcar", 10, 1.70);
        String opcao;

        do {
        System.out.println(" 1 - Cadastrar produtos");
        System.out.println(" 2 - Atualizar o primeiro produto");
        System.out.println(" 3 - excluir o segundo produto");

        Scanner ler = new Scanner(System.in);

        System.out.println("Opção: ");
        opcao = ler.next();

        switch (opcao) {
            case "1":
                conexao.cadastrarProduto(produto1);
                conexao.cadastrarProduto(produto2);
                conexao.cadastrarProduto(produto3);
                break;
            case "2":
                produto1.setQuantidade(5);
                conexao.atualizarProduto(produto1);
                break;
            case "3":
                conexao.excluirProduto(produto2);
                break;
            default:
                System.out.println("Opcao errada");
                break;
        }
    }while(!opcao.equals("0"));

    }
}
