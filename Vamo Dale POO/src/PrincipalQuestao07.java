public class PrincipalQuestao07 {
    public static double calcularDistancia(Ponto p1, Ponto p2){
        double difX = Math.pow(p1.getX() - p2.getX(), 2);
        double difY = Math.pow(p1.getY() - p2.getY(), 2);
        return Math.sqrt(difX + difY);
    }

    public static void main(String[] args){
        Ponto vetor[] = new Ponto[7];
        vetor[0] = new Ponto(1,1);
        vetor[1] = new Ponto(1,3);
        vetor[2] = new Ponto(2,2);
        vetor[3] = new Ponto(4,5);
        vetor[4] = new Ponto(-1,3);
        vetor[5] = new Ponto(1,4);
        vetor[6] = new Ponto(-1,-3);
        
        double menorDistancia = 99; // Use Double.MAX_VALUE para inicializar a menorDistancia
        double distancia = 0;

        Ponto p1 = null, p2 = null; // Inicialize p1 e p2 para evitar erro de escopo

        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++){
                distancia = calcularDistancia(vetor[i], vetor[j]);
                if (distancia < menorDistancia){
                    menorDistancia = distancia;
                    p1 = vetor[i];
                    p2 = vetor[j];
                }
            }     
        }

        System.out.println("Menor distancia encontrada: " + menorDistancia);
        System.out.println("P1 (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("P2 (" + p2.getX() + "," + p2.getY() + ")");
    }
}
