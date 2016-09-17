import static org.junit.Assert.*;

import org.junit.Test;


public class MovieTest {

	@Test
	public void checkIfDirectorNamesAreSame() {
		Movie m1 = new Movie("Raes", "Shyam", 4);
		Movie m2 = new Movie("Don", "Shekar", 3);
		assertFalse("Director names are not same", m1.compareTo(m2) == 0 );
	}

}
