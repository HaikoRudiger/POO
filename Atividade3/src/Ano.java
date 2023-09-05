public class Ano {
    private int ano;

    public Ano(int ano){
        setAno(ano);
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }


    public String anoBissexto(){
        String resposta = "";

        if ((getAno() % 4 == 0 && getAno() % 100 != 0) || getAno() % 400 == 0){
            resposta = "O ano é bissexto";
        } else {
            resposta = "O ano não é bissexto";
        }

        return resposta;
    }
}
