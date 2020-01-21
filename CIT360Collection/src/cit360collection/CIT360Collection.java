/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author azhra
 */
public class CIT360Collection {

    /**
     * @param args the command line arguments
     */
    // Going to use my cats and do first an irative collection Lists.
    public static void main(String[] args) {
        
        // Going to use my cats and do first an irative collection.
        animal cat1 = new animal("Harlequin","Calico","Quinny",4.7);
        animal cat2 = new animal("Reginald","Silver with black stripes and spots","Reggie",4.6);
        animal cat3 = new animal("Sunny","White with orange highlights","Terror",1.5);
        
        Collection<animal> animals = new ArrayList<>();
            animals.add(cat1);
            animals.add(cat2);
            animals.add(cat3);
        
        //Print it out via the toString constructor from animal class to see if it prints.
        System.out.println(animals);
        
        //Now to iratively pull out each cat on its own line using for each loop.
        for (animal Animal : animals){
            //Now print it on screen
            System.out.println(Animal);
        }
        
        //Using an iterator direct to pull specific info from the animal class.
        final Iterator<animal> animalIterator = animals.iterator();
        // While loop controls this function
        while (animalIterator.hasNext()) {
            animal Animal = animalIterator.next();
            // Controlling what to look for uing an if statement
            if (Animal.getAge() > 2) {
            // print it and it should look like the above function proint out
            System.out.println(Animal);
            }
        
        }
           
    }
    
}
