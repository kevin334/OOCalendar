import static org.junit.Assert.*;

import org.junit.Test;


public class calTest {

	@Test
	public void Test1() {
		int d=20, m=1, y=2010;
        Date date = new Date(m, d, y);
        date.increment();
        assertEquals("test", "1/21/2010", date.toString());
	}
	
	@Test
	public void Test2() {
		int d=31, m=1, y=2010;
        Date date = new Date(m, d, y);
        date.increment();
        assertEquals("test", "2/1/2010", date.toString());
	}
	
	@Test
	public void Test3() {
		int d=31, m=12, y=2010;
        Date date = new Date(m, d, y);
        date.increment();
        assertEquals("test", "1/1/2011", date.toString());
	}
	
	/*@Test
	public void Test4() {
		int d=28, m=2, y=2004;
        Date date = new Date(m, d, y);
        date.increment();
        assertEquals("test", "2/29/2004", date.toString());
	}*/
	
	/*@Test
	public void Test5() {
		int d=30, m=13, y=2001;
        Date date = new Date(m, d, y);
        date.increment();
        assertEquals("test", "2/29/2004", date.toString());
	}*/


}
