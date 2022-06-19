import java.sql.*;

public class Conexão {

    Connection connection;
    String url = "jdbc:mysql://localhost:3306/questao1?useTimezone=true&serverTimezone=UTC";
    String usuario = "root";
    String senha = "bruno2211bruno";


    //primeira opção
    void cadastrarProduto(Produto produto) throws SQLException {
        connection = DriverManager.getConnection(url, usuario, senha);
        String sql = "INSERT INTO PRODUTOS(NOME, DESCRICAO, QUANTIDADE, PRECO) VALUES('" + produto.getNome() + "','" + produto.getDescricao() + "'," + produto.getQuantidade() + "," + produto.getPreco() + ")";
        PreparedStatement estado = connection.prepareStatement(sql);
        estado.execute();
        connection.close();
    }

    //segunda opção
    void atualizarProduto(Produto produto) throws SQLException{
        connection = DriverManager.getConnection(url, usuario, senha);
        String sql = "UPDATE PRODUTOS SET NOME = '" + produto.getNome() + "'," + "DESCRICAO = '" + produto.getDescricao() + "'," + "QUANTIDADE = " + produto.getQuantidade() + "," + "PRECO = " + produto.getPreco() + "WHERE ID = 1";
        PreparedStatement estado = connection.prepareStatement(sql);
        estado.execute();
        connection.close();
    }
    //terceira opção
    void excluirProduto(Produto produto2) throws SQLException{
        connection = DriverManager.getConnection(url, usuario, senha);
        String sql = "DELETE FROM PRODUTOS WHERE ID = 2 ";
        PreparedStatement estado = connection.prepareStatement(sql);
        estado.execute();
        connection.close();
    }



}
