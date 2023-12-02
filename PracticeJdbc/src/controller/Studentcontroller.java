package controller;

import service.Studentservice;

public class Studentcontroller {
public static void main(String[] args) throws Exception {
	Studentservice ss= new Studentservice();
	ss.select();
}
}
