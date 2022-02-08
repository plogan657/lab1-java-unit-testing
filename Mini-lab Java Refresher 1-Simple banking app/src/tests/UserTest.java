package tests;

import model.User;

public class UserTest {
	
	public static void main(String[] args) {
		/*User testUser = new User("mike", "my_password", "Mike", "Smith", "07771234567");
	
		System.out.println(testUser.toString());*/
		
		// automated testing
		
		// 1-Setup the object and test data, initialise
		String test_username = "mike";
		String test_password = "my_password";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		
		// 2-Exercise, run object under test
		User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);
		
		// 3- Verify (Assert)
		
		Boolean passed = true;
		
		if(testUser.getUsername() != test_username)
		{
			System.out.println("TC1 failed: username did not match");
			passed = false;
		}
		if(testUser.getPassword() != test_password)
		{
			System.out.println("TC2 failed: username did not match");
			passed = false;
		}
		
		/* TODO: add three other if-code block just like the above two, to verify other 3 fields of class */
		if(testUser.getFirst_name() != test_first_name)
		{
			System.out.println("TC3 failed: firstname did not match");
			passed = false;
		}
		if(testUser.getLast_name() != test_last_name)
		{
			System.out.println("TC4 failed: lastname did not match");
			passed = false;
		}
		if(testUser.getMobile_number() != test_mobile_number)
		{
			System.out.println("TC5 failed: mobilenumber did not match");
			passed = false;
		}
		
		if(passed) System.out.println("All TC's passed.");
		
		// using asserts
		
		assert testUser.getUsername() == test_username;
		//assert 1==2;
		/*TODO: add the other assertions like the one above,
		 to verify the other four fields of the class */
		
		assert testUser.getPassword()== test_password;
		assert testUser.getFirst_name()== test_first_name;
		assert testUser.getLast_name()== test_last_name;
		assert testUser.getMobile_number()== test_mobile_number;
		
		System.out.println("All java assertions in the test suite passed (none failed).");
		 
	}
}
