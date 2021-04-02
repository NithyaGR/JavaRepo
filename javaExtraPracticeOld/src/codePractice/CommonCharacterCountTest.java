package codePractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CommonCharacterCountTest {

	@Test
	void testDuplicateString() {
		assertEquals(3, CommonCharacterCount.duplicateString("totlotlol"));
	}

}
