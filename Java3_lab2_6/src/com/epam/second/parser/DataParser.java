package com.epam.second.parser;

import java.util.regex.Pattern;

import com.epam.second.exception.DataParserException;

/**
 * @author Hanna.Hlushakova
 *
 */
public class DataParser {

	public static String[] parseStrig(String string) throws DataParserException {
		Pattern pattern = Pattern.compile("\\t", Pattern.CASE_INSENSITIVE);
		String[] parsedString = pattern.split(string);
		String[] sweetsParameters = new String[3];
		try {
			sweetsParameters[0] = parsedString[0];
			sweetsParameters[1] = parsedString[1];
			sweetsParameters[2] = parsedString[2];
		} catch (NumberFormatException e){
			throw new DataParserException("Wrong number format!", e);
		}
		catch (ArrayIndexOutOfBoundsException e){
			throw new DataParserException("Wrong parameters number!", e);
		}
		return sweetsParameters;
	}
}
