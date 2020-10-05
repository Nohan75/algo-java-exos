package com.company;

public class TP2 {

    static void scores(int[] score){
        for(int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }
    }

    static int max(int[] scores){
        int maxScore = scores[0];
        for(int i = 0; i < scores.length; i++){
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        return maxScore;
    }

    static boolean inferieurDix(int[] scores){
        boolean isInferieur = false;
        for(int i = 0; i < scores.length; i++){
            if(scores[i] < 10){
                isInferieur = true;
            }
        }
        return isInferieur;
    }

    public static void main(String[] args) {
        int[] score = {25, 100, 93, 37, 24, 1, 300};

        scores(score);
        System.out.println("-----");
        System.out.println("Le score max est " + max(score));
        System.out.println("-----");
        if(inferieurDix(score)){
            System.out.println("Au moins un score est inférieur à 10");
        } else {
            System.out.println("Aucun score n'est inférieur à 10");
        }
    }
}
