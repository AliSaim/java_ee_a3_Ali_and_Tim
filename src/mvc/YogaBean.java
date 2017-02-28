/*INTERNAL DOCUMENTATION
 * Student 1:  Name: Ali Saim (300759480)
 * Student 2:  Name: Tim Hitchcock (300801451)
 * Course: COMP303(Sec# 001) - Java EE Programming - Assignment 3 (Pair Programming)
 * Date: February 27 2017
 * Class Name: YogaBean.java
 * Class Description:   This is the java bean class
 * 
 * */

package mvc;

public class YogaBean implements java.io.Serializable {
	
	private String name;
	private String email;
	private String contactNumber;
	
	private String gender;
	private int age;
	
	private String batchThatFitsYourTiming;
	private String yogaYouWantToRegisterFor;
	
	private String city;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the batchThatFitsYourTiming
	 */
	public String getBatchThatFitsYourTiming() {
		return batchThatFitsYourTiming;
	}

	/**
	 * @param batchThatFitsYourTiming the batchThatFitsYourTiming to set
	 */
	public void setBatchThatFitsYourTiming(String batchThatFitsYourTiming) {
		this.batchThatFitsYourTiming = batchThatFitsYourTiming;
	}

	/**
	 * @return the yogaYouWantToRegisterFor
	 */
	public String getYogaYouWantToRegisterFor() {
		return yogaYouWantToRegisterFor;
	}

	/**
	 * @param yogaYouWantToRegisterFor the yogaYouWantToRegisterFor to set
	 */
	public void setYogaYouWantToRegisterFor(String yogaYouWantToRegisterFor) {
		this.yogaYouWantToRegisterFor = yogaYouWantToRegisterFor;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
	
	
	

}
