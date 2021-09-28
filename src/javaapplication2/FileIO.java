/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author juan
 */
public class FileIO {

    public FileIO() {
    }

    public void read() {

        ArrayList<String> logList = new ArrayList<String>();
        String[] logsArray;
        String[] numberPages;
        String numberUsers;
        ArrayList users = new ArrayList();
        ArrayList visitedPages = new ArrayList();

        System.out.print("//.... Reading ....// \n");
 
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\juan\\Desktop\\input.txt"));
            String element;
       
            while ((element = reader.readLine()) != null) {
                logList.add(element);
            }
            reader.close();
           
          
            for (int i = 0; i < logList.size(); i++) {
                for (int j = 0; j < logList.size(); j++) {
                    if (logList.get(j).contains("user" + Integer.toString(i))) {
                        System.out.println("Log Found !");
                        logsArray = logList.get(j).split(";");
                        numberPages = logsArray[2].split("_");
                        numberUsers = logsArray[0];
                        visitedPages.add(numberPages[1]) ;
                        users.add(numberUsers);
                      
                        //System.out.println("User " + i + " found ... ");
                        //System.out.println("Page visited: " + numberPages[1]);
                    }
                }
            }
            System.out.println("------VISITED PAGES-------");
            System.out.println("ListSize: "+ visitedPages.size());
            System.out.println("visitedPages: "+ visitedPages); 
            System.out.println("UserForEachVisit: " + users);
            Finder finder = new Finder();
            finder.find(visitedPages);  



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
;

}
