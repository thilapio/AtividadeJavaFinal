import java.util.ArrayList; 
import java.util.List;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NotaItemDAO {
    
    private Connection conn;

    public NotaItemDAO() {
        this.conn = new Conexao().getConexao();
    }
    
    public List<NotaItem> getItensPorNota(int idNota) {
    String sql = "SELECT * FROM Nota_Itens WHERE id_nota = ?";
    List<NotaItem> lista = new ArrayList<>();
    
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, idNota);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                NotaItem item = new NotaItem();
                item.setIdItem(rs.getInt("id_item"));
                item.setIdNota(rs.getInt("id_nota"));
                item.setIdProduto(rs.getInt("id_produto"));
                item.setQuantidade(rs.getInt("quantidade"));
                item.setValorUnitario(rs.getBigDecimal("valor_unitario"));
                lista.add(item);
            }
        }
    } catch (SQLException e) {
        System.out.println("Erro ao buscar itens da nota: " + e.getMessage());
    }
    return lista;
}
    
    public void inserir(NotaItem item) {
        String sql = "INSERT INTO Nota_Itens (id_nota, id_produto, quantidade, valor_unitario) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, item.getIdNota());
            stmt.setInt(2, item.getIdProduto());
            stmt.setInt(3, item.getQuantidade());
            stmt.setBigDecimal(4, item.getValorUnitario());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir item da nota: " + e.getMessage());
        }
    }
}