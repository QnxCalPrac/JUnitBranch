package JUnit;

import static org.junit.Assert.assertTrue;
import org.junit.Test;



public class JUnitTestCaseRunner {
	
	boolean check = false;
	double notionalValid = 6000000.0;
	double notionalInvalid = 4000000.0;
	
		@Test
	public void checkLE_invalidNotional() {
		try {
		check = JUnitWorkflowRunner.notionalValidation(notionalInvalid);
		assertTrue(true==check);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}


	@Test
	public void checkLE_validNotional() {
		try {
		check = JUnitWorkflowRunner.notionalValidation(notionalValid);
		assertTrue(false==check);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}


