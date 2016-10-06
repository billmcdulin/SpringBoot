package edu.uc.hackathon.model;

public class WelcomeModel {

	private String heading;

	private String description;

	public WelcomeModel() {
	}

	public WelcomeModel(String heading, String description) {
		super();
		this.heading = heading;
		this.description = description;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
