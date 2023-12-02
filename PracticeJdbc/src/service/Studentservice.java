package service;

import dao.StudentDAO;

public class Studentservice {
public void select () throws Exception {
	StudentDAO sd=new StudentDAO();
	sd.select();
}
}
