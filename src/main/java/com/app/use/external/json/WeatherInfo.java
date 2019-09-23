package com.app.use.external.json;

public class WeatherInfo {

	private String title;

    private WeatherDescription description;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public WeatherDescription getDescription() {
		return description;
	}
	public void setDescription(WeatherDescription description) {
		this.description = description;
	}
}