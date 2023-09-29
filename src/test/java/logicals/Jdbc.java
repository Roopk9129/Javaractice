package logicals;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Jdbc {
	public static void main(String[] args) throws SQLException {
		
	
	Driver d = new Driver(); 
	DriverManager.registerDriver(d);
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldetails","root","root");
	Statement state = con.createStatement();
	String query = "select ename,dname sal from emp,dept where emp.deptno=dept.deptno";
	ResultSet res = state.executeQuery(query);
	while(res.next()) {
		System.out.println(res.getString(1)+"\t"+res.getString(2));
		
	}
	
		

	
		
		
	

}}
