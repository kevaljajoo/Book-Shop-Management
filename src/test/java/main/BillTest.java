package main;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Cart;
import main.Item;
import main.BookShop;
import org.junit.Before;
import org.junit.Test;


public class BillTest {
/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF YOUR PROJECT !!!
 * 	
 */
	
	
	
	@SuppressWarnings("static-access")
	@Test
	public void billTest() {
		Cart c = new Cart();
		BookShop s = new BookShop();
		int t = 0;
		
		for(int i=0;i<2;i++){
            s.itemAvailable[i] = new Item();
        }
        s.itemAvailable[0].addItem("maggi", 24);
        s.itemAvailable[1].addItem("coffee", 100);
        c.updateCart(s.itemAvailable[0], 5);
        c.updateCart(s.itemAvailable[1], 6);
		
		
		 
		
		//not negative check
		//fail("Not yet implemented");
		 assertEquals(720,c.calcBill());
	}/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF YOUR PROJECT !!!
 * 	
 */
	
	
	@SuppressWarnings("static-access")
	@Test
	public void billTest2() {
		Cart c1 = new Cart();
		BookShop s = new BookShop();
		int t = 0;
		
		for(int i=0;i<2;i++){
            s.itemAvailable[i] = new Item();
        }
		s.itemAvailable[0].addItem("maggi", 40);
        s.itemAvailable[1].addItem("apple", 156);
        c1.updateCart(s.itemAvailable[0], 1);
        c1.updateCart(s.itemAvailable[1], 20);
      
	
		
		//not negative check
		
		//fail("Not yet implemented");
		 assertEquals(3160,c1.calcBill());
	}
	Cart c;
	BookShop s;
	@Before
	public void setUp() throws Exception {
		c = new Cart();
		s = new BookShop();
		
	}

	@SuppressWarnings("static-access")
	@Test
	public void cartTest1() {
//		s.itemAvailable[0]
	    for(int i=0;i<2;i++){
            s.itemAvailable[i] = new Item();
        }
        s.itemAvailable[0].addItem("maggi", 24);
        s.itemAvailable[1].addItem("coffee", 100);
        c.updateCart(s.itemAvailable[0], 5);
        c.updateCart(s.itemAvailable[1], 6);
        assertEquals(2,c.noOfItems);
		
		 
	}
	@SuppressWarnings("static-access")
	@Test
	public void cartTest2() {
		Cart c1 = new Cart();
		BookShop s1 = new BookShop();
		
		//		s.itemAvailable[0]
	    for(int i=0;i<2;i++){
            s1.itemAvailable[i] = new Item();
        }
        s1.itemAvailable[0].addItem("maggi", 24);
        s1.itemAvailable[1].addItem("coffee", 100);
        c1.updateCart(s.itemAvailable[0], 5);
        c1.updateCart(s.itemAvailable[1], 6);
        assertEquals(2,c1.noOfItems);
		
		 
	}
	@SuppressWarnings("static-access")
	@Test
	public void cartTest3() {
//		s.itemAvailable[0]
		Cart c2 = new Cart();
		BookShop s2 = new BookShop();
	    for(int i=0;i<2;i++){
            s2.itemAvailable[i] = new Item();
        }
        
        assertEquals(0,c2.noOfItems);
		
		 
	}
	@Test
    public void customerTest() {
		
		CustomerName cn = new CustomerName();
		String test = "testnameCust";
		cn.setName(test);
		assertEquals(test,cn.getName());
		//	fail("Not yet implemented");
	}
	Item i;
	@Before
    public void setUp1() throws Exception {
	 i = new Item();
	}
	String n;
	@Test
	public void itemTest() {
		
		 n = "testName";
		int mrp = 4535;
		i.addItem(n, mrp);
		
		
		assertEquals(mrp,i.getMrp());
		//fail("Not yet implemented");
	}


}