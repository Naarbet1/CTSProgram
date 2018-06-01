package com.cts.dbconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
private static String username="sa";
private static String password="";
private static String url="jdbc:h2:tcp://localhost/~/test51";
private static String driver="org.h2.Driver";
private DbConnection() {
	
}
public static Connection getconnection() {
	try {
		Class.forName(driver);
		return DriverManager.getConnection(url,username, password);
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
		return null;
	}
}
}
