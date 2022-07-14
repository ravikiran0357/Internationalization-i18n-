package com.example.demo.helper;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
@Configuration
public class Internationalization implements WebMvcConfigurer
{
	@Bean
	public LocaleResolver localeResolver()
	{
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(Locale.UK);
		return sessionLocaleResolver;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addInterceptors(registry);
		registry.addInterceptor(localeChangeInterceptor());
	}

	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor()
	{
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("languageCode");
		return localeChangeInterceptor;
	}
}
