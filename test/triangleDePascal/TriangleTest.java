package triangleDePascal;
import static org.junit.jupiter.api.Assertions.*;

 import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TriangleTest {

	Triangle tr;
	
	@BeforeEach
	void setUp() throws Exception {
		tr = new Triangle();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	// @param 1, 2, 1
	// @return 1, 3, 3, 1
	void nouvelleLigneTest1() {
//		assertEquals(Arrays.asList(new Integer[] { 1, 3, 3, 1 }), tr.nouvelleLigne(Arrays.asList(new Integer[] { 1, 2, 1 })));
		assertEquals(Arrays.asList(1, 3, 3, 1) , tr.nouvelleLigne(Arrays.asList(1, 2, 1)));
	}
	
	@Test
	// @param 1, 1
	// @return 1, 2, 1
	void nouvelleLigneTest2() {
		assertEquals(Arrays.asList(new Integer[] { 1, 2, 1 }), tr.nouvelleLigne(Arrays.asList(new Integer[] { 1, 1 })));
	}
	
	@Test
	// @param 1 
	// @return 1, 1
	void nouvelleLigneTest3() {
		assertEquals(Arrays.asList(new Integer[] { 1, 1 }), tr.nouvelleLigne(Arrays.asList(new Integer[] { 1 })));
	}
	
	@Test
	// @param 1, 3, 3, 1 
	// @return 1, 4, 6, 4, 1
	void nouvelleLigneTest4() {
		assertEquals(Arrays.asList(new Integer[] { 1, 4, 6, 4, 1 }), tr.nouvelleLigne(Arrays.asList(new Integer[] { 1, 3, 3, 1 })));
	}
	
//	@Disabled
	@Test
	// @param 1, 11, 55, 165, 330, 462, 462, 330, 165, 55, 11, 1 
	// @return 1, 12, 66, 220, 495, 792, 924, 792, 495, 220, 66, 12, 1
	void nouvelleLigneTest5() {
		assertEquals(Arrays.asList(new Integer[] { 1, 12, 66, 220, 495, 792, 924, 792, 495, 220, 66, 12, 1 }), tr.nouvelleLigne(Arrays.asList(new Integer[] { 1, 11, 55, 165, 330, 462, 462, 330, 165, 55, 11, 1 })));
	}

}
