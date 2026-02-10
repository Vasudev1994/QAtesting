Feature: Login Functionality

Scenario: Verify login with valid credentials
	Given user should access application url as "https://www.saucedemo.com/"
	When  user should enter username as "standard_user" and password as "secret_sauce"
	Then  user should click on login button
	And   user should verify homepage title as "Swag Labs"