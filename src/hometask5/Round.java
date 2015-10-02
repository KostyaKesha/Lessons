package hometask5;

class Round extends Shape {
    double radius;
@Override
   public double calcArea(){
        double areaRound = Math.PI *(int) radius*radius;
       return areaRound;
    }
}
