/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author azhra
 */
public class CIT360Maps {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Map<Integer,String> initNameOrder = new HashMap<Integer,String>();
       
            initNameOrder.put(22,"Regnot");
            initNameOrder.put(12,"Mintou");
            initNameOrder.put(18,"Serandipity");
            initNameOrder.put(6,"Lugop");
            
            initNameOrder.put(14,"Roughnut");
            initNameOrder.put(7,"Harlequin");
            initNameOrder.put(21,"Reginald");
            initNameOrder.put(3,"Sunny");
            
            Set set = initNameOrder.entrySet();
            
            Iterator iterator = set.iterator();
      
            while(iterator.hasNext()) {
         
                Map.Entry initiativeOrder = (Map.Entry)iterator.next();
         
                System.out.print("Initiative: "+ initiativeOrder.getKey() + " is for ");
         
                System.out.println(initiativeOrder.getValue());
            }
        }
    }       
            
            
            
            
    

   

