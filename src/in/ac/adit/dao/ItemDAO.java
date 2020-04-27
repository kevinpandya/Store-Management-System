package in.ac.adit.dao;

import in.ac.adit.model.Item;

public interface ItemDAO {

	final String DRIVER = "com.mysql.jdbc.Driver";
	final String USERNAME = "root";
	final String PASSWORD = "";
	final String DATABASE = "storemngt_db";
	final String connectionString = "jdbc:mysql://localhost:3306/"+DATABASE;
	
	
	public boolean Insert_item(Item item);
	public boolean Update_item_price(Item item);
	public boolean Update_item_quantity(Item item);
	public boolean Delete_item(int item_id);
	public Item getItem(int item_id);
	
	
}
