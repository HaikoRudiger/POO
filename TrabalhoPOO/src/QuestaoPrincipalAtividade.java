public class QuestaoPrincipalAtividade {
    public static void main(String[] args) {
        // Criar um array de carros
        Carro[] carros = new Carro[5];
    
        // Armazenar os carros
        carros[0] = new Carro("Gol", "VW", "MMM001", "Preta", 2009, 1, 25000);
        carros[1] = new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 2, 30000);
        carros[2] = new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 3, 32000);
        carros[3] = new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 1, 29000);
        carros[4] = new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 1, 26000);
    
        // Exemplo de uso dos métodos sem mensagens condicionais
        Carro carroCaroDoAno = Carro.carroCaroAno(carros, 2011);
        System.out.println("Carro mais caro do ano 2011: " + carroCaroDoAno.getModelo());
    
        String listaCarrosMarcaPreco = Carro.listarCarrosMarcaPreco(carros, "Fiat", 25000, 32000);
        System.out.println(listaCarrosMarcaPreco);
    
        String[] carrosCarosBaratosLocal = Carro.listarCarrosCarosBaratosLocal(carros, 1);
        System.out.println(carrosCarosBaratosLocal[0]);
        System.out.println(carrosCarosBaratosLocal[1]);
    }
    
}
