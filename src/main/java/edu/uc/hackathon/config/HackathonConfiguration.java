package edu.uc.hackathon.config;

import org.springframework.context.annotation.Import;

@Import(value = { SwaggerConfig.class, WebSecurityConfig.class })
public class HackathonConfiguration {

}
