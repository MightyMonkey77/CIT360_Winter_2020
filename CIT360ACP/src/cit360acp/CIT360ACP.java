/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360acp;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author azhra
 */
public class CIT360ACP {
    
     private static Scanner entry = new Scanner(System.in);
     
     private static controller Controller = new controller();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       handler addCharacter = new handlerAddCharacter();
       handler getCharacter = new handlerGetCharacter();
       handler getGroup = new handlerGetGroup();
       
       Controller.addCommand("addChar", addCharacter);
       Controller.addCommand("getChar", getCharacter);
       Controller.addCommand("getGroup", getGroup);
       
       start();
    }

    private static void start() {
        
        System.out.println("Please select from the options below");
        System.out.println("1 - Add a Character to the Party");
        System.out.println("2 - Get Character Info");
        System.out.println("3 - See the current Party members");
        System.out.println("4 - Get out of here");
        String option = entry.next();
        doAction(option);
    }

    private static void doAction(String option) {
        
        switch (option) {
        
            case "1":
                System.out.println("");
                System.out.println("Enter character name: ");
                String charFirstName = entry.next();
                
                System.out.println("Enter Initiative: ");
                String charInitiative = entry.next();
                
                HashMap<String,String> characterMap = new HashMap();
                characterMap.put("charFirstName", charFirstName);
                characterMap.put("charinitiative", charInitiative);
                
                Controller.handleRequest("addChar", characterMap);
                System.out.println("");
                start();
                break;
                
            case "2":
                System.out.println("Enter Character name: ");
                String charFirstName2 = entry.next();
                
                Controller.handleRequest("getChar", charFirstName2);
                System.out.println("");
                start();
                break;
                
            case "3":
                // Call .handlerequest() method                
                Controller.handleRequest("getGroup",null);                
                System.out.println("");
                start();
                break;
                
            case "4":
                System.out.println("Get out of here");
                break;    
                
        }
    }
 
}
