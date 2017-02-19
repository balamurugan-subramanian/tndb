package com.tndb.web.login.dao;

import javax.sql.DataSource;

import com.tndb.web.login.bean.UserBean;

public interface UserDAO {
	
	 /** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   /** 
	    * This is the method to be used to create
	    * a user in the User table.
	    */
	   public void create(UserBean user);
	   /** 
	    * This is the method to be used to 
	    * an user from the User table corresponding
	    * to a passed consumer id.
	    */
	   public UserBean getUser(String consumerId); 
	   /** 
	    * This is the method to be used to delete 
	    * an user from the user table.
	    */
	   public void delete(UserBean user);
	   /** 
	    * This is the method to be used to update
	    * a record into the User table.
	    */
	   public void update(UserBean user);

}
