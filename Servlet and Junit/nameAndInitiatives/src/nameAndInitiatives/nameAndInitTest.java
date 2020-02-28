package nameAndInitiatives;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class nameAndInitTest {

	@Test
	public void test() {
				
		/* Assert Array Equals */
		/*Using a initiative system (made up)*/
		int[] characterInitiativeExpected = {21, 17, 12, 8, 16};
		/*Put new string to compare it to */
		int[] characterInitiativeOutcome = {21, 17, 12, 8, 16};
		/*Use the assert to compare both arrays*/
		assertArrayEquals(characterInitiativeExpected, characterInitiativeOutcome);
	
		/*AssertEquals*/
		/*Using character Names to check correctness Edit: tried it in string array form first and could not get that to work*/
		String name1 = "Rog";
		String name2 = "Tuff";
		String name3 = "Lact";
		String name4 = "Gouf";
		String name5 = "Neeli";
		String name6 = "Rog";
		String name7 = "Tuff";
		String name8 = "Lact";
		String name9 = "Gouf";
		String name10 = "Neeli";
		/*assert the equality*/
		assertEquals(name1, name6);
		assertEquals(name3, name8);
		assertEquals(name5, name10);
		assertEquals(name4, name9);
		assertEquals(name2, name7);
		
		
		/*Assert False and Assert True*/
		/*I figured I would try both*/
		
		assertFalse(name1, false);
			
		assertTrue(name1, true);
				
		/*assertNotNull and assert Null*/
		/*Need to set up to variables to allow both the testing of Null and NotNull*/
		String desc = "I cast magic missels into the darkness, hehehe!";
		String name = null;
		/*For not Null all we do is assert the string and it sees if it is empty or not*/
		assertNotNull(desc);
		/*For the Null test to see if string is empty and it showed pass*/
		assertNull(name);
		
		
		/*assertSame assertNotSame*/
		/*Creation of new variables to use for this example*/
		int num1 = 21;
		int num2 = 17;
		int num3 = 17;
		/*assert Same deals with if they are the same it passes*/
		assertSame(num2, num3);
		/*assert Not same will pass if the two are different*/
		assertNotSame(num1, num3);
		
		/*assertThat*/
		/*This took me a while to figure out, it encompass so me parts that are available to test. 
		 * It checks if a specific value match to an expected one. This include Equal, NotEqual,Objects, messages and so on. 
		 */
		int numberOfCharacters= 5;
		assertThat(numberOfCharacters,5);
	
	}

	private void assertThat(int numberOfCharacters, int i) {
		
	}

}
/*This needs to have assertArrayEquals, assertEquals, assertFalse, assertNotNull, assertNotSame, assertNull, assertSame, assertThat, 
 * assertTrue
 */