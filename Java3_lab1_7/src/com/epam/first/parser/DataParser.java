/**
 * 
 */
package com.epam.first.parser;

import java.util.regex.Pattern;

/**
 * @author Hanna.Hlushakova
 *
 */
public class DataParser {

	public static double[] parseStrig(String string) {
		Pattern pattern = Pattern.compile("\\s{3}}", Pattern.CASE_INSENSITIVE);
		String[] parsedString = pattern.split(string);
		double[] cubeParameters = new double[4];
		try {
			cubeParameters[0] = Double.parseDouble(parsedString[0]);
			cubeParameters[1] = Double.parseDouble(parsedString[1]);
			cubeParameters[2] = Double.parseDouble(parsedString[2]);
			cubeParameters[3] = Integer.parseInt(parsedString[3]);
		} catch (NumberFormatException e)
		{e.printStackTrace();}
		
		return cubeParameters;
	}
}
