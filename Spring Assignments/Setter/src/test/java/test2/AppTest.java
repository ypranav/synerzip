package test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.synerzip.demo2.Country;

public class AppTest {
	
  public static void main(String[] args) {
	  
	  String string = "spring2.xml";
		ApplicationContext c = new ClassPathXmlApplicationContext(string);
		
      Country bean = c.getBean(Country.class);
      String countryName = bean.getCountryName();
      String capitalName = bean.getCapital().getCapitalName();
      System.out.println(capitalName+" is the capital of "+countryName ); 
      
  }


}