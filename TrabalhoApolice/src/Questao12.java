public class Questao12 {

    public static String menorIdade(Apolice vetor[]){
        int menorIdade = Integer.MAX_VALUE;
        String retorno = "";
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i].getIdade() < menorIdade){
                menorIdade = vetor[i].getIdade();
                retorno = vetor[i].imprimir();
            } else {
                if(vetor[i].getIdade() == menorIdade){
                    retorno = retorno + "\n" + vetor[i].imprimir();
                }
            }
        }

        return retorno;

    }
    public static void main(String[] args){
        Apolice umApolice = new Apolice("joao", 19, 900.0);
        System.out.println("Item b");
        System.out.println(umApolice.imprimir());

        System.out.println("Item d");
        umApolice.calcularPremio();

        System.out.println(umApolice.imprimir());

        System.out.println("Item e");
        umApolice.oferecerDesconto("Blumenau");

        System.out.println("Item f");
        System.out.println(umApolice.imprimir());

        Apolice vetor[] = new Apolice[5];
        vetor[0] = new Apolice("Joao", 27, 900.0);
        vetor[1] = new Apolice("Maria",18 , 2000.0);
        vetor[2] = new Apolice("Martha",39 , 1600.0);
        vetor[3] = new Apolice("Jose",24 , 2300.0);
        vetor[4] = new Apolice("Tiago",18 , 1700.0);

        




    }
}
