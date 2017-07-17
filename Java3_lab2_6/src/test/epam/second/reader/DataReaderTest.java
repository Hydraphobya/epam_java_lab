package test.epam.second.reader;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.epam.second.reader.DataReader;

import java.util.List;
import test.epam.second.testLogger.TestsRunner;
/**
 * @author Hanna.Hlushakova
 *
 */
@RunWith(TestsRunner.class)
public class DataReaderTest{
	private static String fileName = "data//Present.txt";
	
	@Test
	public void readRawDataTest(){
		int expected = 5;
		int actual;
		List<String> list = DataReader.readRawData(fileName);
		actual = list.size();
		assertEquals("The total number of rows is wrong: ", expected, actual);		
	}
	
}

