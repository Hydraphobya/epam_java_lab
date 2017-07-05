package com.epam.first.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class DataReader {	
	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	}
	
	static Logger logger = Logger.getLogger(DataReader.class);
	public static List<String> readRawData(String fileName){
		List<String> fileData = new ArrayList<>();
		try(Stream<String> stream = Files.lines(Paths.get(fileName))){
			fileData = stream.collect(Collectors.toList());
			
		} catch(IOException e){
			logger.error(e.getMessage(), e);
		}
		return fileData;
	}

}
