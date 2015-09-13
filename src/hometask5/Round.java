package hometask5;

import java.util.Scanner;

class Round extends Shapes {

    protected void round (){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input radius and press Enter");
        int radius = sc.nextInt();
        double areaRound = Math.PI * (radius*radius);
        System.out.println("Area of round is"+" "+ (int)areaRound);
    }
}
