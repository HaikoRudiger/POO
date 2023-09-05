public class Apolice {
    private String nome;
    private int idade;
    private double valorPremio;

    public Apolice(String nome, int idade, double valorPremio) {
        setNome(nome);
        setIdade(idade);
        setValorPremio(valorPremio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public String imprimir() {
        return "Nome: " + getNome() + "\n" + "Idade: " + getIdade() + "\n" + "Valor Prêmio: " + getValorPremio();
    }

    public void calcularPremio() {
        if (getIdade() >= 18 && getIdade() <= 25) {
            setValorPremio(getValorPremio() * 1.20);
        } else {
            if (getIdade() > 25 && getIdade() <= 36) {
                setValorPremio(getValorPremio() * 1.15);
            } else {
                if (getIdade() > 36) {
                    setValorPremio(getValorPremio() * 1.1);
                }
            }
        }
    }

    public void oferecerDesconto(String cidade) {
        if (cidade.equalsIgnoreCase("Ilhota")) {
            setValorPremio(getValorPremio() * 0.95);
        } else if (cidade.equalsIgnoreCase("Blumenau")) {
            setValorPremio(getValorPremio() * 0.97);
        } else if (cidade.equalsIgnoreCase("Itajai")) {
            setValorPremio(getValorPremio() * 0.99);
        } else {
            throw new IllegalArgumentException("Cidade sem benefício");
        }
    }

}
