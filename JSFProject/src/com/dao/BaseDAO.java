package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	
	public Connection getConnection(){
		
		 Connection connection = null;
		 
				try {
					
					//Step1: Load Drivers
					Class.forName("org.gjt.mm.mysql.Driver");
					
					//Step-2:Establishing Connection
					
					 connection =DriverManager.getConnection("jdbc:mysql://localhost:3333/world","root","root");
					
				System.out.println("Connection Successful");
		 } catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return connection;
	}

}
