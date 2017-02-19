package com.tndb.web.login.bean;


public class UserBean {
	
	
	private int consumer_id;
	private String user_name;
	private String password;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String email_address;
	/**
	 * @return the consumer_id
	 */
	public int getConsumer_id() {
		return consumer_id;
	}
	/**
	 * @param consumer_id the consumer_id to set
	 */
	public void setConsumer_id(int consumer_id) {
		this.consumer_id = consumer_id;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the middle_name
	 */
	public String getMiddle_name() {
		return middle_name;
	}
	/**
	 * @param middle_name the middle_name to set
	 */
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the email_address
	 */
	public String getEmail_address() {
		return email_address;
	}
	/**
	 * @param email_address the email_address to set
	 */
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserBean [consumer_id=" + consumer_id + ", user_name=" + user_name + ", password=" + password
				+ ", first_name=" + first_name + ", middle_name=" + middle_name + ", last_name=" + last_name
				+ ", email_address=" + email_address + "]";
	}
	
	

}
