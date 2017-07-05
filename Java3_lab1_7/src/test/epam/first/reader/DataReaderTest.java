package test.epam.first.reader;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.epam.first.reader.DataReader;

import java.util.List;
import test.epam.first.testLogger.TestsRunner;
/**
 * @author Hanna.Hlushakova
 *
 */
@RunWith(TestsRunner.class)
public class DataReaderTest{
	private static String fileName = "data//firstdata.txt";
	
	@Test
	public void readRawDataTest(){
		int expected = 5;
		int actual;
		List<String> list = DataReader.readRawData(fileName);
		actual = list.size();
		assertEquals("The total number of rows is wrong: ", expected, actual);		
	}
	
}
