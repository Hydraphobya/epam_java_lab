package com.epam.first.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReader {	
	public static List<String> readRawData(String fileName){
		List<String> fileData = new ArrayList<>();
		try(Stream<String> stream = Files.lines(Paths.get(fileName))){
			fileData = stream.collect(Collectors.toList());
			
		} catch(IOException e){
			e.printStackTrace();
		}
		return fileData;
	}

}
