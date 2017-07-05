package test.epam.first.action;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.epam.first.action.CubeAction;
import com.epam.first.entity.Cube;
import com.epam.first.entity.Point;
import com.epam.first.entity.Ratio;

import test.epam.first.testLogger.TestsRunner;
/**
 * @author Hanna_Hlushakova
 *
 */
@RunWith(TestsRunner.class)
public class CubeActionTest {
	private static Cube cube; 
	private final static double FAILED_LENGTH = -5;
	
	@BeforeClass
	public static void initCube(){
		Point point = new Point(2, 3, -2.5);
		cube  = new Cube(point, 5);
	}
	@AfterClass
	public static void clearCube(){
		cube = null;
	}
	
	@Test
	public void cubeAreaTest(){
		double expected = 150;
		double actual  = CubeAction.cubeArea(cube);
		assertEquals("Calculated area is wrong:", expected, actual, 0.00001);
	}
	
	@Test
	public void cubeVolumeTest(){
		double expected = 125;
		double actual  = CubeAction.cubeVolume(cube);
		assertEquals("Calculated volume is wrong:", expected, actual, 0.00001);
	}
	
	@Test
	public void isCubeTest(){
		assertFalse(CubeAction.isCube(cube.getCenter(), FAILED_LENGTH));
	}
	
	@Test
	public void volumeRatioTest(){
		Ratio expected = new Ratio(0, 1);
		Ratio actual = CubeAction.volumeRatioByCoordinatePlane(cube.getCenter().getZ(), cube.getSideLength());
		assertEquals(expected, actual);
		
	}
	
	@Test 
	public void isBaseOnCoordinatePlaneTest(){
		assertTrue(CubeAction.isBaseOnCoordinatePlan(cube));
		
		
	}
}
