public class Ponto {

    private double x;
    private double y;
    
    public Ponto(double x, double y){
        setX(x);
        setY(y);
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return this.x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return this.y;
    }
}
