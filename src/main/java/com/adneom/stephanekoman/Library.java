/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.adneom.stephanekoman;

import java.util.ArrayList;
import java.util.List;

public class Library {

    // Fonction de partionnement
    public List<List<Integer>> partition(List<Integer> liste, int taille){
        List<List<Integer>> listOfLists = new ArrayList<>();
        try{
            if(liste.size() > 0 && taille > 0){
                if(liste.size() <= taille){
                    listOfLists.add(liste);
                }else{
                    int t = (int) Math.floor((double) liste.size()/taille);
                    for(int i = 0; i <= t; i++){
                        int tmp = i * taille;
                        List<Integer> sublist = liste.subList(tmp, Math.min(tmp + taille, liste.size()));
                        if(sublist.size() > 0) listOfLists.add(sublist);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listOfLists;
    }

}
