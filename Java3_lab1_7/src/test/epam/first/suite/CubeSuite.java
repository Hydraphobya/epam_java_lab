/**
 * 
 */
package test.epam.first.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * @author Hanna.Hlushakova
 *
 */

import test.epam.first.action.CubeActionTest;
import test.epam.first.action.PointActionTest;

@Suite.SuiteClasses({CubeActionTest.class, PointActionTest.class})
@RunWith(Suite.class)
public class CubeSuite {
}
