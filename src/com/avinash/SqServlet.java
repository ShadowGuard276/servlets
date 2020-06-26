package com.avinash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// int k = (int) req.getAttribute("k");
		// int k= Integer.parseInt(req.getParameter("k"));
		/*
		 * HttpSession session = req.getSession();// session int k = (int)
		 * session.getAttribute("k");
		 */
		int k = 0;
		Cookie cookies[] = req.getCookies(); // cookies transfer

		for (Cookie a : cookies) {
			if (a.getName().equals("k")) {
				k = Integer.parseInt(a.getValue());
			}
		}

		k = k * k;
		PrintWriter out = res.getWriter();
		out.println(" sq of numbers is " + k);
		// System.out.println("sq");
	}
}
