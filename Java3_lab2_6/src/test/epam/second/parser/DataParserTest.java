package test.epam.second.parser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.epam.second.exception.DataParserException;
import com.epam.second.parser.DataParser;
import test.epam.second.logger.TestsRunner;

/**
 * @author Hanna.Hlushakova
 *
 */
@RunWith(TestsRunner.class)
public class DataParserTest {
	@Test
	public void parseStringTest() {
		String str = "10	Candy	Raffaello";
		String[] expected = new String[4];
		expected[0] = "10";
		expected[1] = "Candy";
		expected[2] = "Raffaello";
		try{
		String[] actual = DataParser.parseStrig(str);
		assertTrue(expected.length == actual.length 
					&& expected[0].equals(actual[0])
					&& expected[1].equals(actual[1])
					&& expected[2].equals(actual[2]));}
		catch(DataParserException e){
			fail(e.getMessage());
		}
	}
	@Test(expected = DataParserException.class)
	public void parseFailTest() throws DataParserException{
		String str = "2 Candy Raffaello";
		int expected  = 4;
		String[] parsedData = DataParser.parseStrig(str);
		int actual = parsedData.length;
		assertEquals("For string '" + str + "' should have thrown a DataParseException", expected, actual);
	}
}
