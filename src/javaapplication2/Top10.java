/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author juan
 */
public class Top10 {
    public void execute(ArrayList list){
        ArrayList cantTriplets = new ArrayList();
       for (Object item : list){
           if(!cantTriplets.contains(item.toString()))
           {
               cantTriplets.add(item);
           }
       }
       for (Object item : cantTriplets)
       System.out.println( "Triplet:" + item + " Repeticion: " + Collections.frequency(list, item));
    }
}
