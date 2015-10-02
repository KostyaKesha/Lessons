package hometask5;

class Square extends Shape{
  double side;
    @Override
    public double calcArea() {
        double areaSquare = (side * side);
return areaSquare;
    }
}
