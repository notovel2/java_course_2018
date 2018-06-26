package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;

public class Hello {
	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.start();
		
	}

	private void start() {
		try {
			System.out.println(divide(1,0));
		} catch (InputCantZeroValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private double divide(int a,int b) throws InputCantZeroValueException {
		
		if(b != 0) {
			return a/b;
		}
		throw new InputCantZeroValueException();
		
	}
}

class UserDatabase{
	public String getName(int id){
		
		try {
			Class.forName("mysql.xxxx");
			Connection connection = DriverManager.getConnection("url", "user", "password");
			PreparedStatement preparedStatement = connection.prepareStatement("Select");
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return resultSet.getString("columnLabel");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}