/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360mvc_initiativeorder;

// import java.util.Scanner;

/**
 *
 * @author azhra
 */
public class CIT360MVC_InitiativeOrder {

    public static String characterName;
    public static int characterInit;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        initiativeModel model = new initiativeModel();
        
        initiativeView view = new initiativeView();
        
        initiativeController initiativeController;
        initiativeController = new initiativeController(model, view);

//         Attempted to make it grab from inputs. Even tried JFrame and JPanel with no effect

//        initiativeController.updateView();
//        
//        Scanner initiative = new Scanner(System.in);
//        
//        String characterName = initiative.nextLine();
//        int characterInit = initiative.nextInt();


        initiativeController.updateView();
    
            initiativeController.setCharacterName("Rugb");
            initiativeController.setCharacterInit(12);
            
        initiativeController.updateView();
    
            initiativeController.setCharacterName("Hoffer");
            initiativeController.setCharacterInit(16);
            
        initiativeController.updateView();
    
            initiativeController.setCharacterName("Nelsworn");
            initiativeController.setCharacterInit(11);
               
        initiativeController.updateView();
    
            initiativeController.setCharacterName("Timmy");
            initiativeController.setCharacterInit(20);    
        
    }
  
}
