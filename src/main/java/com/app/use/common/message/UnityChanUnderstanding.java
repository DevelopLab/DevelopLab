package com.app.use.common.message;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.use.api.json.UnityChanJson;
import com.app.use.common.util.WeatherUtil;
import com.app.use.external.api.WeatherApi;

@Component
public class UnityChanUnderstanding {

	@Autowired
	private WeatherUtil weatherUtil;

	@Autowired
	private WeatherApi weatherApi;

	public UnityChanJson userInputUnderstanding(String message) {

		UnityChanJson unityChanEntity = new UnityChanJson();
		if (message.matches(".*" + "平石" + ".*")) {
			String [] messages = {"。。。"
					, "ほう、そいつについて聞いてしまうとは、"
					, "教えてあげる..."
					, "ただのMです(笑)"};
			unityChanEntity.setMessage(messages);
			unityChanEntity.setResultCode("N00");
			unityChanEntity.setEmotion("Conversation");
			return unityChanEntity;
		}

		if (message.matches(".*" + "守" + ".*")) {
			String [] messages = {"Mです。"};
			unityChanEntity.setMessage(messages);
			unityChanEntity.setResultCode("N00");
			unityChanEntity.setEmotion("Conversation");
			return unityChanEntity;
		}

		if (message.matches(".*" + "天気" + ".*")) {
			String weatherId = weatherUtil.getWeatherId(message);
			if (!"".equals(weatherId)) {
				try {
					String weather = weatherApi.getWeather(weatherId);
					String[] messages = {"お天気受信 ピピピピ（　（　( ( ( (ﾟ∀ﾟ) ) ) ）　）　） ﾃﾞﾝﾊﾟ ☼ ☂ ☁ ！！！！", weather};
					unityChanEntity.setMessage(messages);
					unityChanEntity.setResultCode("N00");
					unityChanEntity.setEmotion("Conversation");
				} catch (Exception e) {
					unityChanEntity.setResultCode("L00");
					unityChanEntity.setEmotion("Error");
				}
				return unityChanEntity;
			} else {
				String[] messages = {"どこの地域の天気が知りたい？", "「天気」というキーワードと「1次細分区名（例・東京）」を入力してください。"};
				unityChanEntity.setMessage(messages);
				unityChanEntity.setResultCode("N00");
				unityChanEntity.setEmotion("Conversation");
				return unityChanEntity;
			}
		}

		unityChanEntity.setMessage(this.randomMessage());
		unityChanEntity.setResultCode("N00");
		unityChanEntity.setEmotion("Conversation");
		return unityChanEntity;
	}

	private String[] eventDayMessage(String nowDay) {
		if (nowDay.matches(".*" + "01-01")
				|| nowDay.matches(".*" + "01-02")
				|| nowDay.matches(".*" + "01-03")) {
			return new String[] {"...??? 何を言ってるか分からない。 "
					, "正月ボケかな（笑）"
					, "脳みそも !!!NEW━ﾟ+.(@(●´Å`●)@).+ﾟ.━YEAR!!!しちゃったのかなwww"
					, "(*｀･ω・)ﾉ⌒Σ>―→*:・ﾟ* 　Σ>―(´･ω･`)→ ｸﾞｻｯ"};
		}

		if (nowDay.matches(".*" + "10-" + ".*")) {
			return new String[] {"(艸-∀-*)☆TRICK OR TREAT☆(*-∀-艸)"
					, "（*´∀｀）ヽ＜◆－◆＞→（*◆T◆）変身！！！"
					, "(★ФДФ)ﾉ ﾟ+｡:.ﾟお菓子くれないといたずらするぞ~♪ﾟ.:｡+ﾟ"};
		}

		if (nowDay.matches(".*" + "12-24")
				|| nowDay.matches(".*" + "12-25")) {
			return new String[] {"(●´д｀｡o○○o｡メリクリ｡o○○o｡´Д｀○)ゞ"
					, "聖なるお告げです．．．"
					, "リア充爆発しろ（゜言゜）　ドカーン!!!"};
		}

		return null;
	}

	private String[] randomMessage() {
		Random random = new Random();
		int iValue = random.nextInt(3);
		if (iValue == 0) {
			return new String[] {"...??? 外人さんかな（笑）"
					, "日本語通じますか？"
					, "What country are you from?"
					, "Fucker❤　(⋈◍＞◡＜◍)。✧♡"};
		}
		if (iValue == 1) {
			return new String[] {"俺だ!", "何言っているか分からない…"
					, "何！基幹の人間が言語妨害でんぱを配信だと!!"
					, "ふ．．．これも．．．シュタインズゲートの選択か．．．"
					, "エル・プサイ・コングルー！！ ヽ(*ﾟдﾟ)ノ　＜　ｶｲﾊﾞｰ"
					, "※このネタはアニメ「STEINS;GATE（シュタインズ・ゲート）」を参考に"};
		}
	    if (iValue == 2) {
			return new String[] {"えへへへ..."
					, "何言って分からないσ(´┰｀=)"
					, "近くの病院探してあげようか？（笑）"
					, "(●´ω｀●)ゞてへぺろ"};
	    }
	    if (iValue == 3) {
	    	String[] eventMessage = eventDayMessage(LocalDate.now().toString());
	    	if (eventMessage != null) {
	    		return eventMessage;
	    	}
	    }
		return new String[] {"。。。"
				, "何言って分からないﾟ(ﾟ´Д｀ﾟ)ﾟ"
				, "お前、マジ卍（笑）"};
	}
}
