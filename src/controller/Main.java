package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = ConnectionManager.getConnection();
		if (connection != null) {
			System.out.println("Connection Established!!");
		} else {
			System.out.println("Check your Connection");
		}
	}
}
