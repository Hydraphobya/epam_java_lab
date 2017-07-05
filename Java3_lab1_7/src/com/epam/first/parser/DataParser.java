/**
 * 
 */
package com.epam.first.parser;

import java.util.regex.Pattern;

import com.epam.first.exception.DataParseException;

/**
 * @author Hanna.Hlushakova
 *
 */
public class DataParser {

	public static double[] parseStrig(String string) throws DataParseException {
		Pattern pattern = Pattern.compile("\\s", Pattern.CASE_INSENSITIVE);
		String[] parsedString = pattern.split(string);
		double[] cubeParameters = new double[4];
		try {
			cubeParameters[0] = Double.parseDouble(parsedString[0]);
			cubeParameters[1] = Double.parseDouble(parsedString[1]);
			cubeParameters[2] = Double.parseDouble(parsedString[2]);
			cubeParameters[3] = Integer.parseInt(parsedString[3]);
		} catch (NumberFormatException e){
			throw new DataParseException("Wrong number format!", e);
		}
		catch (ArrayIndexOutOfBoundsException e){
			throw new DataParseException("Wrong parameters number!", e);
		}
		return cubeParameters;
	}
}
