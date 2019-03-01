/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorvsarraylist;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author aenam
 */
public class VectorVSArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String>arr=new ArrayList<String>();
        arr.add("15L-4195");
        arr.add("15L-4136");
        arr.add("15L-4256");
        arr.add("15L-4313");
        System.out.println("Data inside the ArrayList");
        Iterator i=arr.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
        Vector<String>vtr=new Vector<String>();
        vtr.addElement("15L-4195");
        vtr.addElement("15L-4136");
        vtr.addElement("15L-4265");
        vtr.addElement("15L-4313");
        System.out.println("Data inside the Vector");
        Enumeration e=vtr.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

    }
    
}
