package hometask5;

public abstract class Shape {
    protected double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract double calcArea();

}

