import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection;
public class main {

    public static void main(String[] args) throws SQLException {
        Scanner ler = new Scanner(System.in);
        Connection connection;

        conexão conexao = new conexão();

        System.out.println("Qual pagina voce deseja ver ?");
        int pagina = ler.nextInt();
        System.out.println("Quantos filmes desejar ver ? ");
        int tamanho = ler.nextInt();


        ArrayList<filme> filmes = (ArrayList<filme>) conexao.listarFilmes(pagina, tamanho);
        for (filme filme: filmes) {
            System.out.println(filme.getNome());
        }

    }
}
