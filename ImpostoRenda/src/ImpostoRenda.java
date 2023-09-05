public class ImpostoRenda {
    
    private String nome;
    private double salario;

    public ImpostoRenda(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf(){
        
        int faixa = 0;
        double aliquota = 0;

        if (getSalario() <= 1903.98){
           faixa = 1; 
           aliquota = 0;
        } else if (getSalario() >= 1903.99 && getSalario() <= 2826.65){
            aliquota = 
        } else if (getSalario() >= 2826.66 && getSalario() <= 3751.05) {
            aliquota = getSalario() - (15 * getSalario());
        } else if (getSalario() >= 3751.06 && getSalario() <= 4664.68) {
            faixa = 4;
            aliquota = getSalario() - (22.5 * getSalario());
        } else {
            faixa = 5;
            aliquota = getSalario() - (27.5 * getSalario());
        }
        return aliquota;
    }
}
