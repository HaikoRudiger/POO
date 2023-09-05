public class PrincipalQuestao4 {
    
    public static void main(String[] args){
    
    Soma calculadora = new Soma();
    
    int resultadoInt = calculadora.somarInt(1, 1);
    double resultadoDouble = calculadora.somarDouble(2, 3);

    System.out.println("Soma dos inteiros: " + resultadoInt);
    System.out.println("Soma dos inteiros: " + resultadoDouble);

}
}
