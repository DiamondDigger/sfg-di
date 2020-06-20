package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

//		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
//		System.out.println(i18nController.sayGreeting());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("---------------MyController");
		System.out.println(myController.sayHello());
//
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//		System.out.println("--------------Property");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
//		System.out.println("--------------Setter");
//		System.out.println(setterInjectedController.getGreeting());
//
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//		System.out.println("--------------Constructor");
//		System.out.println(constructorInjectedController.getGreeting());

	}
}
