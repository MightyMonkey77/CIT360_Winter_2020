/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360json;

/**
 *
 * @author azhra
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CIT360JSON {

    /**
     * @param args the command line arguments
     * @throws org.json.simple.parser.ParseException
     */
    public static void main(String[] args) throws org.json.simple.parser.ParseException {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the characters name: ");
        String characterName = input.nextLine();
        
        System.out.print("Enter the characters Race: ");
        String characterRace = input.nextLine();
               
        System.out.print("Enter the characters Class: ");
        String characterClass = input.nextLine();
             
        System.out.print("Enter the characters Strength: ");
        String characterStr = input.nextLine();
               
        System.out.print("Enter the characters Dexterity: ");
        String characterDex = input.nextLine();
        
        System.out.print("Enter the characters Wisdom: ");
        String characterWis = input.nextLine();
        
        System.out.print("Enter the characters Intellegence: ");
        String characterInt = input.nextLine();
        
        System.out.print("Enter the characters Constitution: ");
        String characterCon = input.nextLine();
        
        System.out.print("Enter the characters Charisma: ");
        String characterCha = input.nextLine();
                
        JSONObject characters = new JSONObject();
        characters.put("name", characterName);
        characters.put("Race", characterRace);
        characters.put("Class", characterClass);
        characters.put("Str", characterStr);
        characters.put("Dex", characterDex);
        characters.put("Wis", characterWis);
        characters.put("Int", characterInt);
        characters.put("Con", characterCon);
        characters.put("Cha", characterCha);

        
        System.out.println(characters.toJSONString());

        File file = new File("characterInfo");
            try (PrintWriter writer = new PrintWriter(file)){
                writer.print(characters.toJSONString());
            }
            catch (FileNotFoundException ex) {
                System.out.println(ex.toString());
            }
            
            System.out.println("File created. \n Press enter to continue.");
            input.nextLine();
            
            try {
                input = new Scanner(file);
                
                StringBuilder jsonIn = new StringBuilder();
			while (input.hasNextLine()) {
				jsonIn.append(input.nextLine());
			}
			System.out.println(jsonIn.toString());
			
			// Parse string
			JSONParser parser = new JSONParser();			
			JSONObject objRoot = (JSONObject) parser.parse(jsonIn.toString());
            }
            
            catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
			
		}
            
      
        
    }
    
}
