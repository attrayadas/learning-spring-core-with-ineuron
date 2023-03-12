package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.Car;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		Car car1 = factory.getBean("car1", Car.class);
		System.out.println(car1); // Car [regNo=KA4567, engineNo=12345, type=Hatchback, model=Swift,
									// company=Maruti Suzuki, color=red, engineCC=1500, owner=sachin,
									// fuelType=Petrol]

		System.out.println();

		Car car2 = factory.getBean("car2", Car.class);
		System.out.println(car2); // Car [regNo=JH1234, engineNo=6789, type=Hatchback, model=Swift, company=Maruti
									// Suzuki, color=white, engineCC=1500, owner=dhoni, fuelType=Petrol]

		System.out.println();

		Car car3 = factory.getBean("baseCar", Car.class);
		System.out.println(car3); // Error creating bean with name 'baseCar': Bean definition is abstract
	}
}
