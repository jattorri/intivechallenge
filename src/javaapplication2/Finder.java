/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class Finder {

    public void find(ArrayList visitedPages) {
        ArrayList triplets = new ArrayList();
        System.out.println(" Searching for triplets... ");
        try {
            for (int i = 0; i < visitedPages.size() - 1; i++) {
                if (Integer.parseInt(visitedPages.get(i).toString())
                        ==Integer.parseInt(visitedPages.get(i + 1).toString())-1
                        && Integer.parseInt(visitedPages.get(i + 1).toString())
                        == Integer.parseInt(visitedPages.get(i + 2).toString())-1) {
                    String a = visitedPages.get(i).toString() 
                            + visitedPages.get(i + 1).toString() 
                            + visitedPages.get(i + 2).toString();
                    triplets.add(a);
                }
            }
        }catch(Exception e){System.out.println("ERROR CATCHED (array out of bound)");}

        for (Object t : triplets) {
            
            System.out.println("------ Triplet Found ! -------");
            System.out.println(t.toString());
        }
            System.out.println("------TOP 10------");
            Top10 top10 = new Top10();
            top10.execute(triplets);

    }
}
