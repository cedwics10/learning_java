package vues;

import dao.UserDAO;
import entites.Database;
import entites.User;

public class Main {

	public static void main(String[] args) {
		Database.Connect();
		UserDAO udao = new UserDAO();
		
		/*
		for(User u:udao.getAll()) {
			System.out.println(u);
		}
		*/
		User u1=udao.getById(2);

	}

}
