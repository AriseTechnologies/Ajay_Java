package com.tka.controller;

import java.sql.Connection;
import java.sql.SQLException;

import com.tka.dao.TourDao;

public class TourMainData {
public static void main(String[] args) throws SQLException {
	Connection con=TourDao.connect();
	TourDao.validatelogin();
}
}
