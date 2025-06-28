import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class NotasDAO {

    private Connection conn;

    public NotasDAO() {
        this.conn = new Conexao().getConexao();
    }

    public int inserir(Notas nota) {
        String sql = "INSERT INTO Notas (data_nota, valor_total, id_fornecedor, tipo_nota) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setTimestamp(1, Timestamp.valueOf(nota.getDataNota()));
            stmt.setBigDecimal(2, nota.getValorTotal());
            stmt.setInt(3, nota.getIdFornecedor());
            stmt.setString(4, nota.getTipoNota());
            
            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Falha ao criar a nota, nenhuma linha afetada.");
            }

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1); 
                } else {
                    throw new SQLException("Falha ao criar a nota, nenhum ID obtido.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir nota: " + e.getMessage());
            return -1; 
        }
    }
}