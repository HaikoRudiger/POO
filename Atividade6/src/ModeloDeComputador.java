

public class ModeloDeComputador {
    private int placamae;
    private int processador;
    private int memoria;
    private int discorigido;
    private int monitor;

    public ModeloDeComputador(int placamae, int processador, int memoria, int discorigido, int monitor){
        setPlacamae(placamae);
        setProcessador(processador);
        setMemoria(memoria);
        setDiscorigido(discorigido);
        setMonitor(monitor);
    }

    public int getPlacamae() {
        return placamae;
    }

    public void setPlacamae(int placamae) {
        this.placamae = placamae;
    }

    public int getProcessador() {
        return processador;
    }

    public void setProcessador(int processador) {
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getDiscorigido() {
        return discorigido;
    }

    public void setDiscorigido(int discorigido) {
        this.discorigido = discorigido;
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }

    public double calcularPreco() {
        double valorPlacamae = 800;
        double valorProcessador = 0;
        double valorMemoria = 0;
        double valorDisco = 0;
        double valorMonitor = 0;
        
        if (processador == 1){
            valorProcessador = 700;
        } else if (processador == 2){
            valorProcessador = 830;
        } else {
            valorProcessador = 910;
        }

        if (memoria == 1){
            valorMemoria = 350;
        } else if (memoria == 2){
            valorMemoria = 700;
        } else if (memoria == 3){
            valorMemoria = 1050;
        } else {
            valorMemoria = 1400;
        }

        if (discorigido == 1){
            valorDisco = 300;
        } else if (discorigido == 2){
            valorDisco = 420;
        } else {
            valorDisco = 500;
        }

        if (monitor == 1){
            valorMonitor = 320;
        } else {
            valorMonitor = 520;
        }


        double valorTotal = valorPlacamae + valorProcessador + valorMemoria + valorDisco + valorMonitor;


        return valorTotal;

    }

    
}


