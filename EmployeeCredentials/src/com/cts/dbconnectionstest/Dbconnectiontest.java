package com.cts.dbconnectionstest;

import com.cts.dbconnections.DbConnection;

public class Dbconnectiontest {
public static void main(String[] args) {
	if(DbConnection.getconnection()!=null)
		System.out.println("Connection Established");
	else
		System.out.println("Connection Error");
}}
