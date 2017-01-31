package com.javaee.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaee.servlet.dto.Prediction;
import com.javaee.servlet.service.MatchPredict;


public class MainController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String homeTeam = request.getParameter("homeTeam");
		String guestTeam = request.getParameter("guestTeam");
		
		MatchPredict matchPredict = new MatchPredict();
		Prediction prediction = matchPredict.getPrediction(homeTeam, guestTeam);
		
		request.setAttribute("prediction", prediction);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}
