package com.app.use.common.message;

import java.time.LocalDate;
import java.util.Calendar;

import com.app.use.common.util.StringUtil;
import com.app.use.entity.extension.UserProfile;

public class Greeter {

	private final String MORNING_MESSAGE = "おはようヽ(´▽｀)/ ！！！！";
	private final String NOON_MESSAGE = "こんにちは( ´▽｀)！！！！";
	private final String NIGHT_MESSAGE = "こんばんは(( _ _ ))..zzzZZ！！！！";

	private final String EVENT_ΗΑΡΡΥ_NEW_WEAR = "(＄・∀・)ノ【ΗΑΡΡΥ　ΝΕШ　ΥΕΑЯ】ヽ(・∀・＄)";
	private final String EVENT_TRICK_OR_TREAT = "（（（◆▼◆）））☆*:;;:*★Happy Halloween★*:;;:*☆（（（◆▼◆）））";
	private final String EVENT_CHRISTMAS = "(○´ω｀)ﾉ・‥…━━★☆★Merry Christmas★☆★━━|ω-。)>*";

	public String[] getGreeterMessage(Calendar cTime, UserProfile userProfile) {

		String eventMessage = eventDayMessage(LocalDate.now().toString());
		if (!"".equals(eventMessage)) {
			String[] messages = {eventMessage + StringUtil.LINE_SEPARATOR + userProfile.getName() + "さん"};
			return messages;
		}

		String message = null;
		int time = cTime.get(Calendar.HOUR_OF_DAY);
		if (time > 5 && time < 12) {
			message = userProfile.getName() + "さん" + MORNING_MESSAGE;
		} else if (time > 12 && time < 17) {
			message = userProfile.getName() + "さん" + NOON_MESSAGE;
		} else {
			message = userProfile.getName() + "さん" + NIGHT_MESSAGE;
		}

		String[] messages = {message};
		return messages;
	}

	private String eventDayMessage(String nowDay) {
		if (nowDay.matches(".*" + "01-01")
				|| nowDay.matches(".*" + "01-02")
				|| nowDay.matches(".*" + "01-03")) {
			return EVENT_ΗΑΡΡΥ_NEW_WEAR;
		}

		if (nowDay.matches(".*" + "10-31")) {
			return EVENT_TRICK_OR_TREAT;
		}

		if (nowDay.matches(".*" + "12-24")
				|| nowDay.matches(".*" + "12-25")) {
			return EVENT_CHRISTMAS;
		}

		return "";
	}
}
