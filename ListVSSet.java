/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listvsset;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author aenam
 */
public class ListVSSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> l = new ArrayList<String>();
        l.add("15L-4195");
        l.add("15L-4136");
        l.add("15L-4256");
        l.add("15L-4313");
        System.out.println("List Elements: ");
        System.out.print(l);

        
        
        int count[] = {0, 1, 2, 3, 4};
        Set<Integer> hash = new HashSet<Integer>();
        try{
            for(int i = 0; i<4; i++){
            hash.add(count[i]);
        }
        System.out.println(hash);
 
        TreeSet<Integer> treeset = new TreeSet<Integer>(hash);
        System.out.println("Set:");
        System.out.println(treeset);
        
        
        Iterator itr = treeset.iterator(); 
        System.out.println("The iterator values are: "); 
        while (itr.hasNext()) { 
            System.out.println(itr.next());
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
