import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FornecedoresDAO {

    private Connection conn;

    public FornecedoresDAO() {
        this.conn = new Conexao().getConexao();
    }
    
    public List<Fornecedores> getTodosFornecedores() {
    String sql = "SELECT * FROM Fornecedores ORDER BY nome_empresa";
    
    List<Fornecedores> lista = new ArrayList<>();
    
    try (PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        
        while (rs.next()) {
            Fornecedores fornecedor = new Fornecedores();
            
            fornecedor.setIdFornecedor(rs.getInt("id_fornecedor"));
            fornecedor.setNomeEmpresa(rs.getString("nome_empresa"));
            fornecedor.setNomeContato(rs.getString("nome_contato"));
            fornecedor.setCnpj(rs.getString("cnpj"));
            fornecedor.setTelefone(rs.getString("telefone"));
            fornecedor.setEmail(rs.getString("email"));
            fornecedor.setEndereco(rs.getString("endereco"));
            
            lista.add(fornecedor);
        }
        
    } catch (SQLException e) {
        System.out.println("Erro ao buscar todos os fornecedores: " + e.getMessage());
    }
    
    return lista;
}
    
    public void inserir(Fornecedores fornecedor) {
        String sql = "INSERT INTO Fornecedores (nome_empresa, nome_contato, cnpj, telefone, email, endereco) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, fornecedor.getNomeEmpresa());
            stmt.setString(2, fornecedor.getNomeContato());
            stmt.setString(3, fornecedor.getCnpj());
            stmt.setString(4, fornecedor.getTelefone());
            stmt.setString(5, fornecedor.getEmail());
            stmt.setString(6, fornecedor.getEndereco());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir fornecedor: " + e.getMessage());
        }
    }

    public Fornecedores getFornecedor(int id) {
        String sql = "SELECT * FROM Fornecedores WHERE id_fornecedor = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.first()) {
                    Fornecedores fornecedor = new Fornecedores();
                    fornecedor.setIdFornecedor(rs.getInt("id_fornecedor"));
                    fornecedor.setNomeEmpresa(rs.getString("nome_empresa"));
                    fornecedor.setNomeContato(rs.getString("nome_contato"));
                    fornecedor.setCnpj(rs.getString("cnpj"));
                    fornecedor.setTelefone(rs.getString("telefone"));
                    fornecedor.setEmail(rs.getString("email"));
                    fornecedor.setEndereco(rs.getString("endereco"));
                    return fornecedor;
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar fornecedor: " + e.getMessage());
        }
        return null;
    }

    public void editar(Fornecedores fornecedor) {
        String sql = "UPDATE Fornecedores SET nome_empresa = ?, nome_contato = ?, cnpj = ?, telefone = ?, email = ?, endereco = ? WHERE id_fornecedor = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, fornecedor.getNomeEmpresa());
            stmt.setString(2, fornecedor.getNomeContato());
            stmt.setString(3, fornecedor.getCnpj());
            stmt.setString(4, fornecedor.getTelefone());
            stmt.setString(5, fornecedor.getEmail());
            stmt.setString(6, fornecedor.getEndereco());
            stmt.setInt(7, fornecedor.getIdFornecedor());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao editar fornecedor: " + e.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM Fornecedores WHERE id_fornecedor = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao excluir fornecedor: " + e.getMessage());
        }
    }
    
}