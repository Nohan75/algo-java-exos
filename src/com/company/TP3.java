package com.company;

public class TP3 {
    
    /**
     * Affiche tout les scores d'un tableau.
     * @param score un tableau contenant les scores
     */
    static void scores(int[] score){
        for(int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }
    }

    /**
     * Compare les scores et retourne la valeur maximal contenu dans le tableau.
     * @param scores est un tableau contenant les scores
     * @return la valeur maximal du tableau des scores
     */
    static int max(int[] scores){
        int maxScore = scores[0];
        for(int i = 0; i < scores.length; i++){
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        return maxScore;
    }


    /**
     * Vérifie si au moins un score du tableau est inférieur à 10.
     * @param scores est un tableau contenant les scores
     * @return true si au moins un des scores du tableau est inférieur à 10
     */
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

    }
}
