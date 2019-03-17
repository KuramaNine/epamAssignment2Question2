package epamTask2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleInterestCompoundInterestTest {
	SimpleInterestCompoundInterest simpleInterestCompoundInterestObject;
	@Before
	public void setUp() throws Exception {
		simpleInterestCompoundInterestObject = new SimpleInterestCompoundInterest(100, 1, 1, 1);
	}
	@Test
	public void test() {
		Assert.assertEquals(1.0, simpleInterestCompoundInterestObject.calculateSimpleInterest(),0.0);
		Assert.assertEquals(1.0, simpleInterestCompoundInterestObject.calculateCompoundInterest(), 0.1);
	}

}
