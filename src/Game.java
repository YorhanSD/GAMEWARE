public class Game {

    private long id = 0;
    private String nome;
    private String editora;
    private String genero;
    private double preco;
    private int anoLancamento;

    public long getID(){
        return id;
    }

    public void setID(long id){
        this.id = id;
    }

    public String getNome(){
        return nome; 
    }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public String getEditora(){
        return editora; 
    }

    public void setEditora(String editora){
        this.editora = editora; 
    }

}
