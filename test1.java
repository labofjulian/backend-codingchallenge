package codingProject;

/* Testing Cases */

/* importing Junit libraries */
import static org.junit.jupiter.api.Assertation.*;
import org.junit.jupiter.api.Test;

public class test1 {

	@Test
	public void zip1lowerthanx() {
		
		/* initializing the first two zipcodes. */
		int zip1 = 55346;
		int zip2 = 66665;
		
		/* Comparison class */
	 compare junit = new compare();
	 
	 /* Entering the next two zipcodes as parameters*/
	 String res = junit.compare(55555, 66666)
			 
	/* Asserting the Test case as succesful or failure*/
	 assert.equals("So you can't have any zipcodes outside of 55346 and 66666", res);
	}
	
	@Test
	public void zip1higherthanx() {
		
		/* initializing the first two zipcodes. */
		int zip1 = 65346;
		int zip2 = 66665;
		
		/* Comparison class */
	 compare junit = new compare();
	 
	 /* Entering the next two zipcodes as parameters*/
	 String res = junit.compare(55555, 66666)
			 
	/* Asserting the Test case as succesful or failure*/
	 assert.equals("So you can't have any zipcodes outside of 55555 and 66665", res);
	}

	@Test
	public void zip2lowerthany() {
		
		/* initializing the first two zipcodes. */
		int zip1 = 65346;
		int zip2 = 66000;
		
		/* Comparison class */
	 compare junit = new compare();
	 
	 /* Entering the next two zipcodes as parameters*/
	 String res = junit.compare(55555, 66666)
			 
	/* Asserting the Test case as succesful or failure*/
	 assert.equals("So you can't have any zipcodes outside of 55555 and 66666", res);
	}

	@Test
	public void zip2higherthany() {
		
		/* initializing the first two zipcodes. */
		int zip1 = 65346;
		int zip2 = 67000;
		
		/* Comparison class */
	 compare junit = new compare();
	 
	 /* Entering the next two zipcodes as parameters*/
	 String res = junit.compare(55555, 66666)
			 
	/* Asserting the Test case as succesful or failure*/
	 assert.equals("So you can't have any zipcodes outside of 55555 and 67000", res);
	}
	
	@Test
	public void zipsaredifferent() {
		
		/* initializing the first two zipcodes. */
		int zip1 = 35346;
		int zip2 = 37000;
		
		/* Comparison class */
	 compare junit = new compare();
	 
	 /* Entering the next two zipcodes as parameters*/
	 String res = junit.compare(55555, 67000)
			 
	/* Asserting the Test case as succesful or failure*/
	 assert.equals("So you can't have any zipcodes outside of 35346 - 37000 or 55555 - 67000", res);
	}


}
