package org.bhargavi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /*
        Tight Coupling which is bad
        Car car = new Car();
        car.drive();
        Bike bike = new Bike();
        bike.drive();*/


        /*using xml file to know the bindings
        ApplicationContext context = new ClassPathXmlApplicationContext("Mapping.xml");
        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        */

        // here it uses annotation based bindings
        ApplicationContext context = new ClassPathXmlApplicationContext("Mapping.xml");
//        Vehicle vehicle = (Vehicle) context.getBean("bike");
//        vehicle.drive();

        /*Tyre tyreObj = (Tyre) context.getBean("tyre");
        //tyreObj.setBrand("MRF");
        System.out.println(tyreObj);*/


        Car c = (Car) context.getBean("car");
        c.drive();
    }
}
