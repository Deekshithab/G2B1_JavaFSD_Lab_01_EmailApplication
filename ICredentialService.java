package com.greatlearning.email;

public interface ICredentialService {
	String generatePassword();
	String generateEmailAddress(Employee employee);

	void displayCredentials(Employee employee);

}
