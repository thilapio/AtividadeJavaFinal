public class Categorias {
    private int catId; 
    private String nome; 
    private String descricao; 
    
    // getters
    public int getCatId(){
        return catId; 
    }
    
    public String getNome(){
        return nome; 
    }
    
    public String getDescricao(){
        return descricao; 
    }
    
    // setters 
    public void setCatId(int catId){
        this.catId = catId; 
    }
    
    public void setNome(String nome){
        this.nome = nome; 
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao; 
    }
}
