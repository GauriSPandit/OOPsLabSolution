package service;

import model.Employee;

public class CredentialService {

	public String generatePassword() {
		
	
		String number			="123456789";
		String capitalLetters 	="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters		="abcdefghijklmnopqrstuvwxyz";
		String specialCharacter	="!@#$%&*";
		
		char [] pass = new char[8];
		int random;
		
		
		for (int i=0; i < pass.length; i++) {
					switch (i) {
					case 0:
					case 5:
						random = (int) (Math.random() * capitalLetters.length());
						pass[i]   = capitalLetters.charAt(random);
						break;
					case 2:
					case 4:
						random = (int) (Math.random() * smallLetters.length());
						pass[i]   = smallLetters.charAt(random);
						break;
					case 3:
					case 7:
						random = (int) (Math.random() * number.length());
						pass[i]   = number.charAt(random);
						break;
					case 6:
					case 1:
						random = (int) (Math.random() * specialCharacter.length());
						pass[i]   = specialCharacter.charAt(random);
						break;

					default:
						break;
					
				}     
        }
		String password = String.valueOf(pass);
		return password;
	}
	
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		StringBuilder email = new StringBuilder();
		email.append(firstName.toLowerCase());
		email.append(lastName.toLowerCase());
		email.append("@");
		email.append(department.toLowerCase());
		email.append(".");
		email.append("abc.com");
		return email.toString();
	}

	
	public void showCredentials(String firstName, String email, String password) {
		System.out.println("Dear "+ firstName + " your generated credentials are as follows" );
		System.out.println("Email --->"+ email );
		System.out.println("Password --->"+ password );
		return;
		
	}
	
}
