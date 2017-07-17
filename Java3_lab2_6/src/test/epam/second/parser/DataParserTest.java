package test.epam.second.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.epam.second.exceptions.DataParserException;
import com.epam.second.parser.DataParser;

import test.epam.second.testLogger.TestsRunner;

/**
 * @author Hanna.Hlushakova
 *
 */
@RunWith(TestsRunner.class)
public class DataParserTest {
	@Test
	public void parseStringTest() {
		String str = "10	Candy	Raffaello";
		double[] expected = new double[4];
		expected[0] = 2.3;
		expected[1] = -1;
		expected[2] = 34;
		try{
		double[] actual = DataParser.parseStrig(str);
		assertTrue(expected.length == actual.length 
					&& expected[0] == actual[0]
					&& expected[1] == actual[1]
					&& expected[2] == actual[2]);}
		catch(DataParserException e){
			fail(e.getMessage());
		}
	}
	@Test(expected = DataParserException.class)
	public void parseFailTest() throws DataParserException{
		String str = "2.3 -1d 3412";
		int expected  = 4;
		double[] parsedData = DataParser.parseStrig(str);
		int actual = parsedData.length;
		assertEquals("For string '" + str + "' should have thrown a DataParseException", expected, actual);
	}
}
