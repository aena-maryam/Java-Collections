/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetvssortedset;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author aenam
 */
public class HashSetVSSortedSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> hash = new HashSet<String>(); 
  
        hash.add("15L-4195"); 
        hash.add("15L-4136"); 
        hash.add("15L-4256"); 
        hash.add("15L-4313");
        hash.add("15L-4195"); //the duplicate will be removed
        System.out.println("Elements of HashSet: "); 
        for (String temp : hash) { 
            System.out.println(temp);
        }
        
        SortedSet<String> sorted = new TreeSet<>(); 
        sorted.add("15L-4195"); 
        sorted.add("15L-4136"); 
        sorted.add("15L-4256"); 
        sorted.add("15L-4313"); 
  
        System.out.println("Sorted Set: " + sorted); 
        System.out.println("First: " + sorted.first()); 
        System.out.println("Last: " + sorted.last()); 
  
    }
}
