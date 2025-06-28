import java.math.BigDecimal;

public class Produtos {
    private int idProduto;
    private String nome;
    private String descricao;
    private BigDecimal precoCusto;
    private BigDecimal precoVenda;
    private int quantidadeEstoque;
    private String codigoBarras; 
    private int idCategoria; // Para armazenar a chave estrangeira

    // --- Getters ---
    public int getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    
    public String getCodigoBarras(){
        return codigoBarras; 
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    // --- Setters ---
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public void setCodigoBarras(String codigoBarras){
        this.codigoBarras = codigoBarras; 
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}
