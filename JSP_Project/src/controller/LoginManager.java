package controller;


import java.util.*;

import bean.*;
public class LoginManager {
	private List<Login> login = new ArrayList<>();
	public LoginManager() {
		super();
		ProjectManager pjm = new ProjectManager();
		login = pjm.getLogin();
	}

	
	public boolean verifyLogin(Login l) {
		boolean result = false;
		for(Login log : login) {
			if(l.getUsername().equals(log.getUsername()) &&
			l.getPassword().equals(log.getPassword())){
				result = true;
			}
		}
		return result;
	}
}
