/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayvslist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aenam
 */
public class ArrayVSList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[]=new int[8];
        for(int i=0;i<8;i++)
        {
            arr[i]=(i+10);
        }
        System.out.println("Array:");
        System.out.println("Elements of Array1:");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
        
        System.out.println("Elements of Array2:");
        int arr2[][]={{1,2,3},{2,4,5},{4,4,5}};  
        for(int i=0;i<3;i++){  
            for(int j=0;j<3;j++){  
                System.out.println(arr2[i][j]+" ");  
            }  
            System.out.println();  
        }
        
        List<String> arrList = new ArrayList<String>();
        arrList.add("15L-4195");
        arrList.add("15L-4316");
        arrList.add("15L-4256");
        arrList.add("15L-4313");
        System.out.println("List:");
        System.out.println("Elements from ArrayList");
        System.out.println(arrList);
        
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("15L-4195");
        linkedList.add("15L-4316");
        linkedList.add("15L-4256");
        linkedList.add("15L-4313");
        System.out.println("List:");
        System.out.println("Elements from LinkedList");
        System.out.println(linkedList);
    }
    
}
