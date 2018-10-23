package dOne.pages;

import common.AutomationActions;
import interfaces.LoginEntity;

public class LoginPage extends AutomationActions{
	public LoginPage() {
	}
	
	public void login(String repository, String strUsername, String strPassword) {
		select(LoginEntity.repositoryDropdown, repository);
		type(LoginEntity.usernameTextbox, strUsername);
		type(LoginEntity.passwordTextbox, strPassword);
		// click(driver, dashboards.LoginEntity.loginButton);
		click(LoginEntity.loginButton);
	}
}
