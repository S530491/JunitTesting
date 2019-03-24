package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=test.square(5);
//		we will call static method to check the validity of output
		assertEquals(25,output);
	}

}
