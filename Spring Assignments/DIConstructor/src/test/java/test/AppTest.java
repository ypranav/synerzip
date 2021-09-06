package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.synerzip.service.Country;

public class AppTest {


	 public static void main(String[] args) {
	        String string = "spring.xml";
			ApplicationContext appContext = new ClassPathXmlApplicationContext(string);
	 
	        Country countryObj = appContext.getBean(Country.class);
	        String countryName=countryObj.getCountryName();
	        String capitalName=countryObj.getCapital().getCapitalName();
	        System.out.println(capitalName+" is capital of "+countryName);
	       
	 }


}
