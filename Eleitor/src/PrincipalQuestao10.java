public class PrincipalQuestao10 {
    
    public static void main(String[] args){
        try {
            Eleitor umEleitor = new Eleitor(" Bia", 23);
            System.out.println(umEleitor.imprimir());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}