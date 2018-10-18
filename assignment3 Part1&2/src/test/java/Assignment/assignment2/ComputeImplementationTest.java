package Assignment.assignment2;

import org.mockito.Mockito;
import junit.framework.*;
import org.junit.Before;
import org.junit.Test;


public class ComputeImplementationTest {
	ICompute interfaceObj;
	ComputeImplementation implementationObj;
	int amount;
	int income;
	
	@Before
	public void setUp() throws Exception{
		implementationObj = new ComputeImplementation();
		amount = 1000;
		income = 2000;
		
		interfaceObj = Mockito.mock(ICompute.class);
	}
	@Test
	public void teardown() throws Exception{
		interfaceObj = null;
		implementationObj = null;
	}
}
