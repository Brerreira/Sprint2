import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class conexão {

    Connection connection;
    String url = "jdbc:mysql://localhost:3306/questao2?useTimezone=true&serverTimezone=UTC";
    String usuario = "root";
    String senha = "bruno2211bruno";



    List<filme> listarFilmes(int pagina, int tamanho) throws SQLException {
        connection = DriverManager.getConnection(url, usuario, senha);
        String sql = "SELECT * FROM FILMES LIMIT " + (pagina -1) * tamanho + "," + tamanho;
        PreparedStatement estado = connection.prepareStatement(sql);
        ResultSet resultado = estado.executeQuery();
        ArrayList<filme> filmes = new ArrayList<>();

        while(resultado.next()){
            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            String descricao = resultado.getString("descricao");
            int ano =  resultado.getInt("ano");

            filmes.add(new filme(id, nome, descricao, ano));
        }
        return filmes;
    }
}
