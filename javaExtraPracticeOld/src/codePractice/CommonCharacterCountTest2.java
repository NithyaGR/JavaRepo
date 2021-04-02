package codePractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CommonCharacterCountTest2 {

	
	@Test
	void testCommonCharacterCount() {
		assertEquals("3", CommonCharacterCount.commonCharacterCount("totlotlol", "lol"));
	}

}
