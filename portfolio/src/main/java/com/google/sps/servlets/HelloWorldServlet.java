package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> msgs = new ArrayList<>();
    msgs.add("I'm currently working on this website.");
    msgs.add("It'll be done soon!");
    msgs.add("Thanks for visiting my page!");
    response.setContentType("application/json;");
    response.getWriter().println(convertToJson(msgs));
  }

  private String convertToJson(ArrayList<String> msgs) {
    String json = "{";
    json += "\"msg1\": ";
    json += "\"" + msgs.get(0) + "\"";
    json += ", ";
    json += "\"msg2\": ";
    json += "\"" + msgs.get(1) + "\"";
    json += ", ";
    json += "\"msg3\": ";
    json += "\"" + msgs.get(2) + "\"";
    json += "}";
    return json;
  }
}
