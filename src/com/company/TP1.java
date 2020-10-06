package com.company;

public class TP1 {

    public static void main(String[] args) {
	// write your code here

        int[] scores = {25, 56, 93, 37, 24, 1, 78};
        float total = 0f;


        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
            total = total + scores[i];
        }
        float moyenne = total / scores.length;
        System.out.println("Moyenne: " + moyenne);

    }
}
