package cit360Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class cit360Hibernate {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");  
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        characters character = new characters();
        character.getCharacterId();
        character.setCharacterFirstName("Rog");
        character.setCharacterLastName("Tully");
        character.setCharacterRace("Half-Orc");
        character.setCharacterClass("Barbarian");
        character.setCharacterStr(18);
        character.setCharacterDex(15);
        character.setCharacterWis(11);
        character.setCharacterInt(16);
        character.setCharacterCon(17);
        character.setCharacterCha(10);
        character.setCharacterAC(21);
        character.setCharacterInitiative(12);
        
            System.out.print(character.getCharacterId() + "  ");
            System.out.print(character.getCharacterFirstName() + "  ");
            System.out.print(character.getCharacterLastName() + "  ");
            System.out.print(character.getCharacterRace() + "  ");
            System.out.print(character.getCharacterClass() + "  ");
            System.out.print(character.getCharacterStr() + "  ");
            System.out.print(character.getCharacterDex() + "  ");
            System.out.print(character.getCharacterWis() + "  ");
            System.out.print(character.getCharacterInt() + "  ");
            System.out.print(character.getCharacterCon() + "  ");
            System.out.print(character.getCharacterCha() + "  ");
            System.out.print(character.getCharacterAC() + "  ");
            System.out.print(character.getCharacterInitiative() + "  ");
            System.out.println();
            	
            Transaction tx = session.beginTransaction();
            session.save(character);
           	System.out.println("Did it work?????.....!!");
           	tx.commit();
            session.close();
           	factory.close();

	}
}
	

