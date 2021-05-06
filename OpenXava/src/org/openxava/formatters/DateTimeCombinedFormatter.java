package org.openxava.formatters;

import java.text.*;

import javax.servlet.http.*;

import org.openxava.util.*;


/**
 * tmp S� que se testea, tanto el parse como el format
 * Date/Time (combined) formatter with multilocale support. <p>
 *
 * @author Peter Smith
 * @author Javier Paniza
 */

public class DateTimeCombinedFormatter extends DateTimeBaseFormatter implements IFormatter {

	private static DateFormat extendedDateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	private static DateFormat dotDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm"); // Only for some locales like "hr"
	
	public String format(HttpServletRequest request, Object date) {
		if (date == null) return "";
		if (date instanceof String || date instanceof Number) return date.toString();
		if (Dates.getYear((java.util.Date)date) < 2) return "";
		// tmp return getDateTimeFormat().format(date);
		return getDateTimeFormat(false).format(date); // tmp
	}

	public Object parse(HttpServletRequest request, String string) throws ParseException {
		if (Is.emptyString(string)) return null;
		if (string.indexOf('-') >= 0) { // SimpleDateFormat does not work well with -
			string = Strings.change(string, "-", "/");
		}
		DateFormat [] dateFormats = getDateTimeFormats();
		for (int i=0; i<dateFormats.length; i++) {
			try {
				java.util.Date result = (java.util.Date) dateFormats[i].parseObject(string);
				return new java.sql.Timestamp( result.getTime() );
			}
			catch (ParseException ex) {
			}
		}
		throw new ParseException(XavaResources.getString("bad_date_format",string),-1);
	}

	/* tmp
	private DateFormat getDateTimeFormat() {
		if (isExtendedFormat()) return extendedDateTimeFormat;
		if (isDotFormat()) return dotDateFormat; 
		return Dates.getDateTimeFormat(); 
	}
	*/
	
	private DateFormat getDateTimeFormat(boolean forParsing) { // tmp
		if (isExtendedFormat()) return extendedDateTimeFormat;
		if (isDotFormat()) return dotDateFormat; 
		return forParsing?Dates.getDateTimeFormatForParsing(Locales.getCurrent()):Dates.getDateTimeFormat(); // tmp 
	}
	
	private DateFormat[] getDateTimeFormats() {
		if (isExtendedFormat() || isDotFormat()) return getExtendedDateTimeFormats(); 
		// tmp return new DateFormat [] { getDateTimeFormat() };
		return new DateFormat [] { getDateTimeFormat(true) }; // tmp
	}
	
}
