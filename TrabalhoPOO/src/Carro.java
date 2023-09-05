public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private String cor;
    private int ano;
    private int localizacao;
    private double preco;
    
    public Carro(String modelo, String marca, String placa, String cor, Integer ano, Integer localizacao, double preco){
        setModelo(modelo);
        setMarca(marca);
        setPlaca(placa);
        setCor(cor);
        setAno(ano);
        setLocalizacao(localizacao);
        setPreco(preco);
    }
    // Metodos acessores(getters) // O objetivo principal de um getter é fornecer acesso somente leitura aos atributos, permitindo que outros objetos leiam o valor do atributo, mas não o modifiquem diretamente.
    public String getModelo() {
        return modelo;
    }
    // Metodos modificadores(setters) // O objetivo principal de um setter é fornecer acesso controlado e, se necessário, validação antes de permitir a modificação de um atributo.
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Integer localizacao) {
        this.localizacao = localizacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static Carro carroCaroAno(Carro[] carros, int ano) {
        Carro carroMaisCaro = null;
        double precoMaisAlto = 0.0;

        for (int i = 0; i < carros.length; i++) {
            Carro carro = carros[i];
            if (carro.getAno() == ano) {
                if (carro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = carro.getPreco();
                    carroMaisCaro = carro;
                }
            }
        }

        return carroMaisCaro;
    }

    public static String listarCarrosMarcaPreco(Carro[] carros, String marca, double precoMin, double precoMax) {
        
        String resposta = "";

        for (int i = 0; i < carros.length; i++) {
            Carro carro = carros[i];
            
            if (carro.getMarca().equalsIgnoreCase(marca) && carro.getPreco() >= precoMin && carro.getPreco() <= precoMax) {
                resposta = "Modelo: " + carro.getModelo() + " Marca: " + carro.getMarca() + " Preço: " + carro.getPreco();
                
            }
        }

        return resposta;
    }

    public static String[] listarCarrosCarosBaratosLocal(Carro[] carros, int localizacao) {
        Carro carroMaisCaro = null;
        double precoMaisAlto = 0.0;
        Carro carroMaisBarato = null;
        double precoMaisBaixo = Double.MAX_VALUE;
        
        String[] respostas = new String[2];

        for (int i = 0; i < carros.length; i++) {
            Carro carro = carros[i];
            if (carro.getLocalizacao() == localizacao) {
                double preco = carro.getPreco();
                if (preco > precoMaisAlto) {
                    precoMaisAlto = preco;
                    carroMaisCaro = carro;
                }
                if (preco < precoMaisBaixo) {
                    precoMaisBaixo = preco;
                    carroMaisBarato = carro;
                }
            }
        }

        if (carroMaisCaro != null) {
            respostas[0] = "Carro mais caro na localização " + localizacao + ": " + "Modelo: " + carroMaisCaro.getModelo() + ", Marca: " + carroMaisCaro.getMarca() + ", Preço: " + carroMaisCaro.getPreco();
        }

        if (carroMaisBarato != null) {
           respostas[1] = "Carro mais barato na localização " + localizacao + ": " + "Modelo: " + carroMaisBarato.getModelo() + ", Marca: " + carroMaisBarato.getMarca() + ", Preço: " + carroMaisBarato.getPreco();
        }

        return respostas;
    }

 
}
