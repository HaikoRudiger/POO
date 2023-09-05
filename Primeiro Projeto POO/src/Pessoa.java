public class Pessoa {
    private String nome;
    private double peso;


    public Pessoa(String nome, double peso){
        setNome(nome);
        setPeso(peso);
    }


    public void setNome (String nome) {
        this.nome = nome;
    } 

    public String getNome(){
        return this.nome; 
    }

    public void setPeso (double peso) {
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso; 
    }

    public String definirCategoria() {

    }
}
