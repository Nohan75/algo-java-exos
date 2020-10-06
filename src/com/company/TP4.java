package com.company;

public class TP4 {


    /**
     * Vérifie si le nombre recherché se trouve dans le tableau et retourne son index
     * @param tab le tableau à parcourir
     * @param number le nombre à trouver
     * @return l'index du numbre dans le tableau
     */
    public static int check(int[] tab, int number){
        int i = -1;
        int low = 0;
        int max = tab.length - 1;


        while(low <= max){
            int mid = (low + max) / 2;

            if(tab[mid] < number){
                low = mid+1;
            } else if(tab[mid] > number){
                max = mid-1;
            } else if(tab[mid] == number){
                i = mid;
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(check(tab, 4));
    }
}
