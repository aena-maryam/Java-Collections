/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treesetvshashset;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * @author aenam
 */
public class TreeSetVSHashSet {

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
        
        
        TreeSet<String> tree = new TreeSet<String>(); 
  
        tree.add("15L-4195"); 
        tree.add("15L-4316"); 
        tree.add("15L-4256"); 
        tree.add("15L-4313");
        tree.add("15L-4195");
        System.out.println("Elements of TreeSet: "); 
        for (String temp : tree) { 
            System.out.println(temp); 
        }
    }
    
}
