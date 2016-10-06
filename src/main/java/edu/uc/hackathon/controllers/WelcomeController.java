package edu.uc.hackathon.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.uc.hackathon.model.WelcomeModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/welcomeAPI")
@Api(value = "/welcomeAPI")
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "retrieveWelcomeMessage", nickname = "retrieveWelcomeMessage")
	public WelcomeModel retrieveWelcomeMessage(@RequestParam String personName) throws Exception {
		return new WelcomeModel("Welcome to UC Hackathon " + personName + "!",
				"This api response is to demonstrate how to invoke a remote web service in Spring using the Spring Boot technology stack.");
	}
}
