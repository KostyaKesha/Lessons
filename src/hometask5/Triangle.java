package hometask5;

import java.util.Scanner;


 class Triangle extends Shapes {
    // Формула Герона Площадь треугольника

    protected void triangle() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input side A and press Enter");
        int sideA = sc.nextInt();
        System.out.println("Input side B and press Enter");
        int sideB = sc.nextInt();
        System.out.println("Input side C and press Enter");
        int sideC = sc.nextInt();
        int p = (sideA + sideB + sideC) / 2;
        int t = p * (p - sideA) * (p - sideB) * (p - sideC);
        double areaTri = Math.sqrt(t);
        System.out.println("Area of triangle is"+ " "+ (int)areaTri);
    }

}
