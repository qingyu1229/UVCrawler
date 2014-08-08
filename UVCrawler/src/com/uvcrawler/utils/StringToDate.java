package com.uvcrawler.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToDate {

	
	private static final String[] regs = {
		"\\d{4}-(\\d{2}|\\d{1})-(\\d{2}|\\d{1})( {0,1}(\\d{2}|\\d{1}):\\d{2}(:\\d{2}){0,1}){0,1}",
		"\\d{4}年(\\d{2}|\\d{1})月(\\d{2}|\\d{1})日( {0,1}(\\d{2}|\\d{1}):\\d{2}(:\\d{2}){0,1}){0,1}",
		"\\d{4}.(\\d{2}|\\d{1}).(\\d{2}|\\d{1})( {0,1}(\\d{2}|\\d{1}):\\d{2}(:\\d{2}){0,1}){0,1}",
		"\\d{4}/(\\d{2}|\\d{1})/(\\d{2}|\\d{1})( {0,1}(\\d{2}|\\d{1}):\\d{2}(:\\d{2}){0,1}){0,1}",
		"\\d{8}" };
	
	private static final String[] formatStrs = { "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm",
		"yyyy-MM-ddHH:mm:ss", "yyyy-MM-ddHH:mm", "yyyy-MM-dd",
		"yyyy年MM月dd日 HH:mm:ss", "yyyy年MM月dd日 HH:mm",
		"yyyy年MM月dd日HH:mm:ss", "yyyy年MM月dd日HH:mm", "yyyy年MM月dd日",
		"yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm",
		"yyyy/MM/ddHH:mm:ss", "yyyy/MM/ddHH:mm", "yyyy/MM/dd",
		"yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm",
		"yyyy.MM.ddHH:mm:ss", "yyyy.MM.ddHH:mm", "yyyy.MM.dd",
		"yyyyMMdd" };
	
	
	public static Date parserDate(String containDateStr){
	
		for (int j = 0; j < regs.length; j++) {
			Pattern pattern = Pattern.compile(regs[j]);
			Matcher matcher = pattern.matcher(containDateStr);
			if (matcher.find()) {
				for (int m = 0; m < formatStrs.length; m++) {
					Date d = format(matcher.group(),
							formatStrs[m]);
					if (d != null) {
						return d;
					}
				}
		}
	}
	return null;
}


	public static Date format(String dateStr, String formatStr) {
		DateFormat sdf = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
		}
		return date;
	}}
