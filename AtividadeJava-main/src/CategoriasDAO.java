import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriasDAO {
    private Conexao conexao;
    private Connection conn;

    public CategoriasDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Categorias categoria) {
        String sql = "INSERT INTO Categorias (nome, descricao) VALUES (?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getDescricao());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir categoria: " + ex.getMessage());
        }
    }

    public Categorias getCategorias(int catId) {
        String sql = "SELECT * FROM Categorias WHERE catId = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, catId);
            ResultSet rs = stmt.executeQuery();
            Categorias cat = new Categorias();

            if (rs.first()) { // Verifica se um resultado foi encontrado
                cat.setCatId(rs.getInt("catId"));
                cat.setNome(rs.getString("nome"));
                cat.setDescricao(rs.getString("descricao"));
                return cat;
            } else {
                return null; // Retorna nulo se não encontrar a categoria
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao consultar categoria: " + ex.getMessage());
            return null;
        }
    }

    public void editar(Categorias categoria) {
        // A query tem 3 parâmetros: nome, descricao, e o id no 'where'.
        String sql = "UPDATE Categorias SET nome = ?, descricao = ? WHERE catId = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getDescricao());
            stmt.setInt(3, categoria.getCatId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar categoria: " + ex.getMessage());
        }
    }

    // NOVO MÉTODO PARA EXCLUIR
    public void excluir(int catId) {
        String sql = "DELETE FROM Categorias WHERE catId = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, catId);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir categoria: " + ex.getMessage());
        }
    }
}
