package com.nelioalves.cursomc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nelioalves.cursomc.services.EmailService;
import com.nelioalves.cursomc.services.SmtpEmailService;

@Configuration
@Profile("prod")
public class ProdConfig {
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService(); 
	}
}
