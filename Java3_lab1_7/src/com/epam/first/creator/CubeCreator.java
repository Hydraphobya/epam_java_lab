package com.epam.first.creator;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.epam.first.entity.Cube;
import com.epam.first.entity.CubeDimensions;
import com.epam.first.entity.Point;
import com.epam.first.exception.DataParseException;
import com.epam.first.parser.DataParser;
import com.epam.first.reader.DataReader;
import com.epam.first.singleton.SingleCubeMap;
/**
 * @author Hanna.Hlushakova
 *
 */
public class CubeCreator{
	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	}
	
	static Logger logger = Logger.getLogger(CubeCreator.class);	
	
	public void fillInData(String fileName){		
		List<String> rawDataList = DataReader.readRawData(fileName);
		for(String entry: rawDataList){
			try{
				double[] cubeData = DataParser.parseStrig(entry);
				
				Point centralPoint = new Point(cubeData[0], cubeData[1], cubeData[2]);
				Cube cube = new Cube(centralPoint, cubeData[3]);
				CubeDimensions cubeDimensions = new CubeDimensions(cube);
				cube.attachObserver(cubeDimensions);
				SingleCubeMap.getTheCubeMap().addCube(cube, cubeDimensions);
			}
			catch (DataParseException e){
				logger.error(e.getMessage());
			}
		}
	}
	

	

}
