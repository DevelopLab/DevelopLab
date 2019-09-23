package com.app.use.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	private static final SimpleDateFormat DATETIME = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	/**
	 * 日時フォーマット(yyyy-MM-dd HH:mm).
	 * @param date DATE
	 * @return yyyy-MM-dd HH:mm
	 */
	public static String datetimeFormat(Date date) {
		return DATETIME.format(date);
	}

	/**
	 * 日時フォーマット(yyyy-MM-dd HH:mm).
	 * @param String DATE
	 * @return yyyy-MM-dd HH:mm
	 */
	public static Date datetimeParse(String date) {
		Date parseDate = null;
		try {
			parseDate = DATETIME.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parseDate;
	}

	/**
	 * 日付フォーマット(yyyy-MM-dd).
	 *
	 * @param birthday yyyyMMdd
	 * @return　年月日(yyyy-MM-dd)
	 */
	public static String dayFormat(String birthday) {
		if (birthday == null || "".equals(birthday)) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
        // yyyy-MM-ddへ変更
        sb.append(birthday.substring(0, 4) + "-");
        sb.append(birthday.substring(4, 6) + "-");
        sb.append(birthday.substring(6, 8));

		return sb.toString();
	}

	/**
	 * 日付分解(yyyyMMdd).
	 *
	 * @param birthday yyyy-MM-dd
	 * @return　年月日(yyyyMMdd)
	 */
	public static String dayParse(String birthday) {
		if (birthday == null || "".equals(birthday)) {
			return null;
		}

		SimpleDateFormat sdfBefore = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdfBefore.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat sdfAfter = new SimpleDateFormat("yyyyMMdd");
		return sdfAfter.format(date);
	}
}
