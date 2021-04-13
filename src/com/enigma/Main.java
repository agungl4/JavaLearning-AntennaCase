package com.enigma;

import com.enigma.models.Antenna;

import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah antenna= ");
        Integer countAntenna = input.nextInt();
        Antenna[] myAntenna = new Antenna[countAntenna];
        for(Integer i = 0; i<myAntenna.length;i++){
            System.out.print("point x antenna ke "+ (i+1)+ " = ");
            Integer pointX = input.nextInt();
            System.out.print("point y antenna ke "+ (i+1)+ " = " );
            Integer pointY = input.nextInt();
            myAntenna[i] = new Antenna(pointX,pointY);
        }

        for (Integer i=0; i<myAntenna.length;i++){
//            System.out.println(myAntenna[i].radius.size());
            System.out.println(myAntenna[i].toString());
        }

        Set<String> intersection = myAntenna[0].radius;
        for(Integer i=0; i<myAntenna.length;i++){
            intersection.retainAll(myAntenna[i].radius);
        }

        System.out.print("hasil area irisan = " + intersection);
    }
}
