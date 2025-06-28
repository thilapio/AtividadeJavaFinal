// Arquivo: ProdutosDAO.java

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutosDAO {

    private Connection conn;

    public ProdutosDAO() {
        this.conn = new Conexao().getConexao();
    }
    
    public Produtos getProdutoPorCodigoBarras(String codigo) {
    String sql = "SELECT * FROM Produtos WHERE cod_barras = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, codigo);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.first()) {
                Produtos produto = new Produtos();
                // ... (preencha todos os campos do produto como no método getProduto)
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoVenda(rs.getBigDecimal("preco_venda"));
                // ... etc
                return produto;
            }
        }
    } catch (SQLException e) {
        System.out.println("Erro ao consultar produto por código de barras: " + e.getMessage());
    }
    return null;
}
    
    public void atualizarEstoque(int idProduto, int quantidadeComprada) {
    String sql = "UPDATE Produtos SET quantidade_estoque = quantidade_estoque + ? WHERE id_produto = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, quantidadeComprada);
        stmt.setInt(2, idProduto);
        stmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Erro ao atualizar estoque: " + e.getMessage());
    }
}

    public void inserir(Produtos produto) {
        String sql = "INSERT INTO Produtos (nome, descricao, preco_custo, preco_venda, quantidade_estoque, cod_barras, id_categoria) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setBigDecimal(3, produto.getPrecoCusto());
            stmt.setBigDecimal(4, produto.getPrecoVenda());
            stmt.setInt(5, produto.getQuantidadeEstoque());
            stmt.setString(6, produto.getCodigoBarras());
            stmt.setInt(7, produto.getIdCategoria());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto: " + e.getMessage());
        }
    }

    public Produtos getProduto(int id) {
        String sql = "SELECT * FROM Produtos WHERE id_produto = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.first()) {
                    Produtos produto = new Produtos();
                    produto.setIdProduto(rs.getInt("id_produto"));
                    produto.setNome(rs.getString("nome"));
                    produto.setDescricao(rs.getString("descricao"));
                    produto.setPrecoCusto(rs.getBigDecimal("preco_custo"));
                    produto.setPrecoVenda(rs.getBigDecimal("preco_venda"));
                    produto.setQuantidadeEstoque(rs.getInt("quantidade_estoque"));
                    produto.setCodigoBarras(rs.getString("cod_barras"));
                    produto.setIdCategoria(rs.getInt("id_categoria"));
                    return produto;
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar produto: " + e.getMessage());
        }
        return null;
    }

public void editar(Produtos produto) {
    String sql = "UPDATE Produtos SET nome = ?, descricao = ?, preco_custo = ?, preco_venda = ?, quantidade_estoque = ?, cod_barras = ?, id_categoria = ? WHERE id_produto = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, produto.getNome());
        stmt.setString(2, produto.getDescricao());
        stmt.setBigDecimal(3, produto.getPrecoCusto());
        stmt.setBigDecimal(4, produto.getPrecoVenda());
        stmt.setInt(5, produto.getQuantidadeEstoque());
        stmt.setString(6, produto.getCodigoBarras());   
        stmt.setInt(7, produto.getIdCategoria());      
        stmt.setInt(8, produto.getIdProduto());        
        
        stmt.execute();

    } catch (SQLException e) {
        System.out.println("Erro ao editar produto: " + e.getMessage());
    }
}

    public void excluir(int id) {
        String sql = "DELETE FROM Produtos WHERE id_produto = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
    }
    
 
}
    