package exercise1;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
	static Connection conn = null;

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/day11?useSSL=false";
		String username = "postgres";
		String password = "2603";
		try {
			System.out.println("Connecting to PG...");

			conn = DriverManager.getConnection(url, username, password);

			System.out.println("Connected successfully");
		} catch (Exception e) {
			e.printStackTrace();
	}

	}
}