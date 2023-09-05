public class Eleitor {
    
    private String nome;
    private Integer idade;
    
    public Eleitor(String nome, Integer idade){
        setNome(nome);
        setIdade(idade);

    }

    public void setNome(String nome){
        this.nome = nome;    
    }

    public String getNome(){
        return this.nome;
    }


    public void setIdade(Integer idade){
        if ( idade < 0){
          throw new IllegalArgumentException("Idade invalida/negativa");
        }    
        this.idade = idade;
    }

    public Integer getIdade(){
        return this.idade;
    }

    private String verificar(){
        if (getIdade() < 16){
            return " não pode votar";
        } else {
            if (getIdade() <= 65){
                return " deve votar";
            }
        }
        return " Voto facultivo";
    }

    public String imprimir(){
        return "O(a) Eleitor(a)" + getNome() + verificar();
    }
}
