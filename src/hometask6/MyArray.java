package hometask6;
import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        int n [] = {55, 22, 71,134,12,10,4,24,15,79}; // Создание массива
        Arrays.sort(n); // Сортировка массива
        String s = Arrays.toString(n);
        System.out.println(s);
        System.out.println("Min value is" + " "+ n [0]);
        System.out.println("Max value is" + " "+ n [n.length-1]);
        int a [] = {89, 94, 345,521,73,12,4,45,88,52};
        
        // Замена первого и последнего элементов местами
        int t = a[0];
        a [0] = a[a.length-1];
        a[a.length-1] =t;
        String f = Arrays.toString(a);
        System.out.println(f);

        // Ввод массива с клавиатуры
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int b = sc.nextInt();
        int[] array = new int[b];
        for (int i=0;i<b;i++){
            System.out.println("Input integer number");
            array[i]=sc.nextInt();
            System.out.println(Arrays.toString(array));
            // Разбивка массива на две части
            int k []= Arrays.copyOfRange(array, 0, array.length /2 );
            int l []= Arrays.copyOfRange(array, array.length /2, array.length );
            Arrays.sort(k); // Сортировка
            Arrays.sort(l);
            System.out.println(Arrays.toString(k));
            System.out.println(Arrays.toString(l));
        }

    }
}
