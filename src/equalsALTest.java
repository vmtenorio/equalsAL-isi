import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class equalsALTest {
	
	List<String> list1;
	List<String> list2;

	@Before
	public void setUp() throws Exception {
		list1 = new ArrayList<String>();
		list2 = new ArrayList<String>();
	}
	
	////////////////////////////////////////
	//		Node Coverage		
	////////////////////////////////////////
	
	// Test que pase por el nodo 2 (salir en primer if)
	@Test
	public void test1() {
		assertTrue(list1.equals(list1));
	}
	
	// Test que pase por el nodo 4 (salir en el segundo if)
	@Test
	public void test2() {
		assertFalse(list1.equals(new Integer(0)));
	}
	
	// Test que pase por el nodo 9 (salir en el tercer return)
	@Test
	public void test3() {
		list1.add ("foo");
		list2.add ("bar");
		
		assertFalse(list1.equals(list2));
	}
	
	// Test que pasa por el nodo 11 (salir en el último return)
	@Test
	public void test4() {
		list1.add ("foo");
		list2.add ("foo");
		
		assertTrue(list1.equals(list2));
	}
	
	//////////////////////////////////////////
	//		Edge-Pair Coverage		//
	//////////////////////////////////////////
	// Solo nos falta un test para el camino [5,6,11], el resto están cubiertos con los anteriores
	@Test
	public void test5() {
		assertTrue(list1.equals(list2));
	}
}
