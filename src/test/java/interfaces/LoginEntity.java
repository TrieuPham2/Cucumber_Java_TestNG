package interfaces;

import common.Element;

public class LoginEntity {
	public static final Element repositoryDropdown = new Element("id", "repository", false);
	public static final Element usernameTextbox = new Element("id", "username", false);
	public static final Element passwordTextbox = new Element("id", "password", false);
	public static final Element loginButton = new Element("className", "btn-login", false);
}
