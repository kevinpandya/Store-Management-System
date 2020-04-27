package in.ac.adit.dao;

import in.ac.adit.model.Owner;

public interface OwnerDAO {
	
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String USERNAME = "root";
		final String PASSWORD = "";
		final String DATABASE = "storemngt_db";
		final String connectionString = "jdbc:mysql://localhost:3306/"+DATABASE;
		public boolean authenticate(Owner owner);
		public boolean createOwner(Owner owner);
		public Owner getOwner(String username);
}