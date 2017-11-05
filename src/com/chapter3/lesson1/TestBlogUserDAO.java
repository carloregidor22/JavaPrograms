package com.chapter3.lesson1;

import com.model.BlogUser;
import com.util.db.BlogUserDAO;

public class TestBlogUserDAO {

	public TestBlogUserDAO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for (BlogUser user : BlogUserDAO.selectAll()){
			System.out.println(user);
		}
	}

}
