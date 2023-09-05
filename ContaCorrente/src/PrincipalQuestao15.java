public class PrincipalQuestao15 {
    public static void main(String[] args) {
        //criando objeto do tipo ContaCorrente
        ContaCorrente cc = new ContaCorrente("João",950.0);
        //chamando metodo fazerDeposito
        cc.fazerDeposito(1000);
        
        System.out.println(cc.getSaldo());        
        //chamando metodo para realizar o saque
        cc.sacar(900);
        System.out.println(cc.getSaldo());
        
        ContaCorrente ccDestino = new ContaCorrente("Maria", 7000.0);
        
        //transferindo R$ 600,00 da conta do joao para a maria
        cc.transferir(ccDestino, 600);
        System.out.println("Saldo cc Maria: " + ccDestino.getSaldo());
        System.out.println("Saldo cc Joao: " + cc.getSaldo());    
        
    }    
}
