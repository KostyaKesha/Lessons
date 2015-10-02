package hometask5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Triangle tri = new Triangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Input side A and press Enter");
        double sideA = sc.nextDouble();
        System.out.println("Input side B and press Enter");
        double sideB = sc.nextDouble();
        System.out.println("Input side C and press Enter");
        double sideC = sc.nextDouble();
        System.out.println("Area of Round is" + " " + tri.area);

        Round rou = new Round();
        System.out.println("Input radius and press Enter");
        double radius = sc.nextDouble();
        System.out.println("Area of round is" + " " + rou.area);

        Square squ = new Square();
        System.out.println("Input side and press Enter");
        double side = sc.nextDouble();
        rou.calcArea();
        System.out.println("Area of triangle is" + " " + squ.area);


    }

}
