package com.company;

public class TP5 {


    /**
     * Vérifie si le nombre recherché se trouve dans le tableau et retourne son index
     * @param tab le tableau à parcourir
     * @param number le nombre à trouver
     * @param low  l'index minimum du tableau
     * @param max l'index maximum du tableau
     * @param mid calcul la moitié d'une intervalle du tableau
     * @param i l'index du nombre dans le tableau
     * @return l'index du nombre recherché dans le tableau
     */
    public static int checkRecursive(int[] tab, int number, int low, int max, int mid, int i){
        if(tab[mid] < number){
            return checkRecursive(tab, number, mid+1, max, ((low + max)/2), mid);
        } else if(tab[mid] > number){
            return checkRecursive(tab, number, low, max-1, ((low + max)/2), mid);
        } else if(tab[mid] == number){
            i = mid;
            return i;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        int intToFind = 2;
        int low = 0;
        int max = tab.length - 1;
        int mid = (low + max) / 2;
        int i = -1;

        System.out.println(checkRecursive(tab, intToFind, low, max, mid, i));
    }

}
