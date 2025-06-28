import java.math.BigDecimal;
import java.time.LocalDateTime; 

public class Notas {
    private int idNota;
    private LocalDateTime dataNota;
    private BigDecimal valorTotal;
    private int idFornecedor;
    private String tipoNota; 

    // --- Getters ---
    public int getIdNota() {
        return idNota;
    }

    public LocalDateTime getDataNota() {
        return dataNota;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    // --- Setters ---
    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public void setDataNota(LocalDateTime dataNota) {
        this.dataNota = dataNota;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }
}