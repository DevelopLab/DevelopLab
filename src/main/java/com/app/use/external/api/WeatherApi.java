package com.app.use.external.api;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.app.use.common.util.EndPointUtil;
import com.app.use.common.util.StringUtil;
import com.app.use.external.json.WeatherInfo;

@Component
public class WeatherApi {

	private final RestTemplate restTemplate = new RestTemplate();

    public String getWeather(String city) throws Exception {
    	String weather = "";

    	WeatherInfo response = restTemplate.getForObject(EndPointUtil.WEATHER_URL, WeatherInfo.class, city);

    	weather = response.getTitle() + StringUtil.LINE_SEPARATOR + response.getDescription().getText();
        return weather;
    }
}
