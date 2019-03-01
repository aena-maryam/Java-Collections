/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigablesetvsnavigablemap;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author aenam
 */
public class NavigableSetVSNavigableMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NavigableMap<String, Integer> naviMap = new TreeMap<String, Integer>(); 
        naviMap.put("One", 888); 
        naviMap.put("Two", 999); 
        naviMap.put("Three", 444); 
        naviMap.put("Four", 555); 
        naviMap.put("Five", 666);
        naviMap.put("Six", 555); 
        System.out.println("NavigableMap:");
        System.out.printf("Descending Order of Set  : %s%n",naviMap.descendingKeySet()); 
        System.out.printf("Floor Element  : %s%n",naviMap.floorEntry("L")); 
        System.out.printf("First Element  : %s%n",naviMap.firstEntry()); 
        System.out.printf("Last Value : %s%n",naviMap.lastKey()); 
        System.out.printf("First Value : %s%n",naviMap.firstKey()); 
        System.out.printf("Original Map Order : %s%n", naviMap); 
        System.out.printf("Reverse Map Order : %s%n",naviMap.descendingMap()); 
        
        
        
        NavigableSet<Integer> naviSet = new TreeSet<>(); 
        naviSet.add(0); 
        naviSet.add(1); 
        naviSet.add(2); 
        naviSet.add(3); 
        naviSet.add(4);
        NavigableSet<Integer> reverse = naviSet.descendingSet();
        System.out.println("Normal order: " + naviSet); 
        System.out.println("Reverse order: " + reverse); 
  
        NavigableSet<Integer> vals = naviSet.tailSet(3, true); 
        System.out.println("Few Values:  " + vals); 
        System.out.println("Few Lower Values: " + naviSet.lower(3)); 
        System.out.println("Few Floor Values: " + naviSet.floor(3)); 
        System.out.println("Few Higher Values: " + naviSet.higher(3)); 
        System.out.println("Few Ceiling Values: " + naviSet.ceiling(3)); 
  
        System.out.println("pollFirst(): " + naviSet.pollFirst()); 
        System.out.println("Navigable Set:  " + naviSet); 
  
        System.out.println("pollLast(): " + naviSet.pollLast()); 
        System.out.println("Navigable Set:  " + naviSet); 
  
        System.out.println("pollFirst(): " + naviSet.pollFirst()); 
        System.out.println("Navigable Set:  " + naviSet); 
  
        System.out.println("pollFirst(): " + naviSet.pollFirst()); 
        System.out.println("Navigable Set:  " + naviSet);
    }
    
}
