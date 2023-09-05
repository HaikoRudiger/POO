import java.util.Scanner;

public class PrincipalQuestao6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Preco da Placa Mae R$ 800,00" );

        System.out.println("Digite a opcao de processador: \n1 - 1.67Mhz \n2 - 2.23Mhz \n3 - 2.56Mhz" );
        int processador = input.nextInt();

        System.out.println("Digite a opcao de memoria: \n1 - 2Gb \n2 - 4Gb \n3 - 6Gb \n4 - 8Gb");
        int memoria = input.nextInt();

        System.out.println("Digite a opcao de disco rigido: \n1 - 320Gb \n2 - 500Gb \n3 - 750Gb");
        int discorigido = input.nextInt();

        System.out.println("Digite a opcao de monitor: \n1 - 19 Polegadas \n2 - 21 Polegadas");
        int monitor = input.nextInt();

        ModeloDeComputador computador = new ModeloDeComputador(monitor, processador, memoria, discorigido, monitor);
        double preco = computador.calcularPreco();

        System.out.println("O preço do computador é: R$" + preco);
        input.close();
    }
}
