package hometask5;

import java.util.Scanner;

class Square extends Shapes{
    protected void square () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input side and press Enter");
        int side = sc.nextInt();
        int areaSquare = (side * side);
        System.out.println("Area of square is" +" "+ areaSquare);
    }
}
