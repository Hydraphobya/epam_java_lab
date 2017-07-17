package com.epam.second.parser;

import java.util.regex.Pattern;

import com.epam.second.exceptions.DataParserException;

/**
 * @author Hanna.Hlushakova
 *
 */
public class DataParser {

	public static double[] parseStrig(String string) throws DataParserException {
		Pattern pattern = Pattern.compile("\\t", Pattern.CASE_INSENSITIVE);
		String[] parsedString = pattern.split(string);
		double[] sweetsParameters = new double[4];
		try {
			sweetsParameters[0] = Double.parseDouble(parsedString[0]);
			sweetsParameters[1] = Double.parseDouble(parsedString[1]);
			sweetsParameters[2] = Double.parseDouble(parsedString[2]);
		} catch (NumberFormatException e){
			throw new DataParserException("Wrong number format!", e);
		}
		catch (ArrayIndexOutOfBoundsException e){
			throw new DataParserException("Wrong parameters number!", e);
		}
		return sweetsParameters;
	}
}
