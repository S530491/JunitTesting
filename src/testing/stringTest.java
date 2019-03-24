package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringTest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int c=test.countA("mani");
		assertEquals(1,c);
	}

}
