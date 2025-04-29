package ListaCesar.modelos;

public class Volume {
    private double radius, height;

    public void setDimen(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    public double calcVolum(){
        return (3.14159*Math.pow(radius,2))*height;

    }
}
