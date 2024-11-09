package com.groot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
		public static void main(String[] args) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("class loaded");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
					PreparedStatement ps=con.prepareStatement("insert into student (name,password) values(?,?)");
					ps.setString(1, "Jai");
					ps.setString(2, "1234");
					int i=ps.executeUpdate();
					System.out.println(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
}
