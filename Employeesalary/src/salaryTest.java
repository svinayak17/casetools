import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class salaryTest {

	@Test
	public void NetSaltest() {
		salary test= new salary ();
		assertEquals(15372,test.NetSal());
	}

}
