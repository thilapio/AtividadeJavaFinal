public class Fornecedores {
    private int idFornecedor;
    private String nomeEmpresa;
    private String nomeContato;
    private String cnpj;
    private String telefone;
    private String email;
    private String endereco;

    // --- Getters ---
    public int getIdFornecedor() {
        return idFornecedor;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    // --- Setters ---
    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
    return this.getNomeEmpresa(); 
}
}