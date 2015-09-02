package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionFactroy;
	//Static block means ,it will execute as soon as the application loads,as son as the class loads into 
	//memory Static block will start execute,it will only execute once for the whole application
	static{
		
		
		// We instantiate configuration class,and call configure method
		// configure method will search for hibernate.cfg.xml as default file name in the path
		
		//We can change the name of the configuration 
		//file name hibernate.cfg.xml and  pass the name explicitly
		
		Configuration configuration = new Configuration();
		
		configuration.configure();
		
		// We create sessionFactroy Object
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		
		//The purpose of building a ServiceRegistry is to register the properties
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.applySettings(configuration.getProperties()).build();
		//We use buildSessionFactory to build a sessionFactory
		sessionFactroy = configuration.buildSessionFactory(serviceRegistry);
			
		
		
	}
	
	// We follow this approach because,it is recommended to 
	//create one sessionFactory throughout the application
	//We can create any no.of sessions
	//A seesionFactory can only hold one DB server
	//For each DBserver we should have one SessionFactory 
	public static SessionFactory getSessionFactroy() {
		return sessionFactroy;
	
	
	}
	
}
