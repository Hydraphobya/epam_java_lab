package test.epam.first.action;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.epam.first.action.PointAction;
import com.epam.first.entity.Point;

import test.epam.first.testLogger.TestsRunner;
/**
 * @author Hanna_Hlushakova
 *
 */
@RunWith(TestsRunner.class)
public class PointActionTest {
	
	private static Point point;  
	@BeforeClass
	public static void initPoint(){
		point = new Point(2, 3, 4);
	}
	@AfterClass 
	public static void cleaPoint() {
		point = null;
	}
	@Test
	public void lengthTest() {
		double expected = 5.38516;
		double actual = PointAction.length(point);
		assertEquals("Calculated length is wrong:",expected, actual, 0.00001);		
	}

	

}
