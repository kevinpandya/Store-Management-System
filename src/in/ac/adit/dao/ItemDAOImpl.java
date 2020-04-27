package in.ac.adit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import in.ac.adit.model.Item;


public class ItemDAOImpl implements ItemDAO {
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet resultSet = null;
	
	public ItemDAOImpl(){
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(connectionString, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  
	
	public boolean Insert_item(Item item) {
	
	try { 
		String query = "insert into item_tb values(?,?,?,?,?)";
		statement = connection.prepareStatement(query);
		statement.setInt(1,item.getItem_id());
		statement.setString(2,item.getItem_name());
		statement.setString(3,item.getItem_company());
		statement.setInt(4,item.getItem_price());
		statement.setInt(5,item.getItem_quantity());
		
		if(statement.executeUpdate()>=1)
		return true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
		return false;
      }

	public boolean Update_item_price(Item item) {
		String query1 = "update item_tb set item_price = ? where item_id = ?";
		try {
			statement = connection.prepareStatement(query1);
			statement.setInt(1,item.getItem_price());
			statement.setInt(2,item.getItem_id());
			if(statement.executeUpdate()>=1)
				return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	
	}
	
	public boolean Update_item_quantity(Item item) {
		String query2 = "update item_tb set item_quantity = ? where item_id = ?";
		try {
			statement = connection.prepareStatement(query2);
			statement.setInt(1,item.getItem_quantity());
			statement.setInt(2,item.getItem_id());
			if(statement.executeUpdate()>=1)
				return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	
	}
	
	public boolean Delete_item(int item_id) {
		try {
		String query = "delete from item_tb where item_id = ?";
		statement = connection.prepareStatement(query);
		statement.setInt(1,item_id);
		
		if(statement.executeUpdate()>=1)
			return true;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	return false;
	}
	public Item getItem(int item_id) {
		try {
		String query = "select * from item_tb where item_id = ?";
		statement = connection.prepareStatement(query);
		statement.setInt(1,item_id);
		resultSet = statement.executeQuery();
		while(resultSet.next()) {
			
		}
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	   }
	
	
	try {
		while (resultSet.next()) {
			Item item = new Item();
			item.setItem_id(item_id);
			
			String item_name=null;
			String item_company=null;
			int item_price=0;
			int item_quantity=0;
			item.setItem_name(item_name);
			item.setItem_company(item_company);
			item.setItem_price(item_price);
			item.setItem_quantity(item_quantity);
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
}