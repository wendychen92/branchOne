package groupName;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}

}
