package com.example.demo.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class InternationalizationController {

	/*
	 * @Autowired private LocaleService localeService;
	 */


  @GetMapping("/langauages")
  public String index(HttpServletRequest request,Model model){
	  
		/* return localeService.getMessage("user.hello", request); */
	  Locale currentLocale=request.getLocale();
	  String countrycode= currentLocale.getCountry();
	  String countryName=currentLocale.getDisplayCountry();
	  
	  String langCode=currentLocale.getLanguage();
	  String langName=currentLocale.getDisplayLanguage();
	  System.out.println(countrycode +": "+countryName);
	  System.out.println(langCode+": "+langName);
	  System.out.println("========================");
	  String [] langauges=Locale.getISOLanguages();
	  for(String language : langauges)
	  {
		  Locale locale =new Locale(language);
		  System.out.println(language+": "+locale.getDisplayLanguage());
		  
	  }
	  return "welcome"; 
  }


}

