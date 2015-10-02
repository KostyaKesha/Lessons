package hometask5;

 class Triangle extends Shape {
     double sideA;
     double sideB;
     double sideC;
     double p;
     double t;
@Override
    public double calcArea() { // Формула Герона Площадь треугольника
        double p = (sideA + sideB + sideC) / 2;
        double t = p * (p - sideA) * (p - sideB) * (p - sideC);
        double areaTri = Math.sqrt(t);
        return areaTri;

    }

}
