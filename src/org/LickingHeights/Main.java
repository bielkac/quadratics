package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //todo declare variables a,b,c,discriminant, axisOfSymmetry,parabolaFacing, x, y
        double a, b, c, discriminant, axisOfSymmetry, x, y;
        String parabolaFacing;
        Scanner radar;

        //todo initialize manually
        radar = new Scanner(System.in);
        System.out.println("Give me an A ");
        a = radar.nextInt();
        System.out.println("Give me a B ");
        b = radar.nextInt();
        System.out.println("Give me a C ");
        c = radar.nextInt();
        a = 5;
        b = 3;
        c = 1;

        //todo do calculations
        axisOfSymmetry = -b / (2 * a);
        discriminant = (b * b) - 4 * (a * c);
        if (discriminant > 0)
            System.out.println("There are two real solutions ");
    }
    else if( discriminant == 0){

    {
        System.out.println("There is one real solutions");
    }
    else{

    {
        System.out.println("There are NO real solutions");
    }



        //todo print results
        System.out.println("Axis of Symmetry: "+axisOfSymmetry);
        System.out.println("Discriminant: "+discriminant);



    //todo initialize scanner and redo the initialize area

    //todo double check results
































    }
}
