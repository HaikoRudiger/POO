public class Ponto {
   private double x;
   private double y;

   public Ponto(double x, double y){
    setX(x);
    setY(y);
    }

    public double getX() {
    return x;
    }

    public void setX(double x) {
    this.x = x;
    }

    public double getY() {
    return y;
    }

    public void setY(double y) {
    this.y = y;
    } 

    private int quadrante() {
        if (getX() >= 0 && getY() >= 0) {
            return 1;
        } else if (getX() < 0 && getY() >= 0) {
            return 2;
        } else if (getX() < 0 && getY() < 0) {
            return 3;
        } else if (getX() >= 0 && getY() < 0) {
            return 4;
        } else {
            throw new IllegalArgumentException("Erro!");
        }
    } 
    public String imprimir() {
        return "O ponto da coordenada ( " + getX() + "," + getY() + " ) está localizado no quadrante: " + quadrante();
    }
}


//metodo minusculo
//classe maiusculo

