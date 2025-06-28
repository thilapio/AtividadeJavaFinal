import java.math.BigDecimal;

public class NotaItem {
    private int idItem;
    private int idNota;
    private int idProduto;
    private int quantidade;
    private BigDecimal valorUnitario;

    // --- Getters ---
    public int getIdItem() {
        return idItem;
    }

    public int getIdNota() {
        return idNota;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    // --- Setters ---
    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
