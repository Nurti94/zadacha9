package com.company;

public class Main {

    public static void main(String[] args) {

        int corzinka=0;
        for (int i = 1; i < 300; i++) {
            if (i%3==0&&i%4==0&&i%5==0){
            corzinka+=i;
            System.out.println(i);

        }
        }
        System.out.println("Kaldyksyz bolungon sandardyn summasy = "+corzinka);

    }
}
