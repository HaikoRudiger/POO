public class Data {
    
    private int dia;
    private int mes;
    private int ano;

    public Data(int ano, int dia, int mes){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }

    public String calcular(){
        int valor = 0;
        String resultado = "";
        int ano = getAno();
        
        valor = ano + getDia() + (3 * (getMes() - 1)) - 1;
        
        if (getMes() < 3){
            ano = ano - 1;
        } else {
            valor = valor - (int)(0.4 * getMes() + 2.3);
        }

        valor = valor + (ano / 4) - (int)(0.75 * (1 + ano / 100));
        valor = valor % 7;

        
        switch(valor){
            case 0:
                resultado = valor + " - Domingo";
                break;
    
            case 1:
                resultado = valor + " - Segunda - Feira";
                break;
    
            case 2: 
                resultado = valor + " - Terca - Feira";
                break;
            
            case 3: 
                resultado= valor + " - Quarta - Feira";
                break;
            
            case 4: 
                resultado = valor + " - Quinta - Feira";
                break;
            
            case 5: 
                resultado = valor + " - Sexta - Feira";
                break;
            
            case 6: 
                resultado = valor + " - Sabado";
                break;
    
            default:
                resultado = "Valor Inválido";
        }

        return resultado;
    }

}
