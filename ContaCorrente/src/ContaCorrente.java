public class ContaCorrente {
    private String nome;
    private double saldo;

    public ContaCorrente(){
        setNome("Sem nome");
        setSaldo(0);
    }

    public ContaCorrente(String nome){
        setNome(nome);
        setSaldo(0);
    }
    
    public ContaCorrente(String nome, double saldo){
        setNome(nome);
        setSaldo(saldo);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void fazerDeposito(double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Deposito com valor negativo");
        }
        setSaldo(getSaldo() + valor);
    }
    
    public boolean sacar(double valor){
        // Verifica se o valor do saque é inválido (negativo ou zero)
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido");
        }
    
        // Verifica se o saldo na conta é suficiente para o saque
        if (valor <= getSaldo()) {
            // Se o saldo for suficiente, subtrai o valor do saque do saldo da conta
            setSaldo(getSaldo() - valor);
            return true; // Retorna verdadeiro para indicar que o saque foi bem-sucedido
        } else {
            return false; // Retorna falso para indicar que o saldo é insuficiente para o saque
        }
    }
    
    public boolean transferir(ContaCorrente outraConta, double valor){
        // Verifica se a conta de destino é válida
        if (outraConta == null) {
            throw new IllegalArgumentException("Conta de destino inválida");
        }
    
        // Tenta sacar o valor da conta atual (chama o método sacar)
        boolean saqueBemSucedido = sacar(valor);
    
        // Verifica se o saque foi bem-sucedido
        if (saqueBemSucedido) {
            // Se o saque foi bem-sucedido, faz um depósito na outra conta (chama fazerDeposito)
            outraConta.fazerDeposito(valor);
            return true; // Retorna verdadeiro para indicar que a transferência foi bem-sucedida
        } else {
            return false; // Retorna falso para indicar que o saldo é insuficiente para a transferência
        }
    }
}
