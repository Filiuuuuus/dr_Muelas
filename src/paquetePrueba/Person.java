package paquetePrueba;

import java.util.Scanner;

public class Person {
	private String name;
	private String surname;
	private int telephone;
	private String home;
	private String email;
	private SocialWork idSocialWork;
	
	Scanner input = new Scanner (System.in);
	
	
	public void inputDat() {
		System.out.println("What is your name? ");
		name = input.next();
		
		System.out.println("and your surname? ");
		surname = input.next();
	}
	
	public void showResult() {
		System.out.println(home);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public SocialWork getIdSocialWork() {
		return idSocialWork;
	}
	public void setIdSocialWork(SocialWork idSocialWork) {
		this.idSocialWork = idSocialWork;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	private int years;
	private int dni;
}
