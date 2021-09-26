package net.typingsites.servlet;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URLDecoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.typingsites.Main;

public class PostTask extends HttpServlet {
  private Main instance;
  
  public PostTask(Main instance) {
    this.instance = instance;
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.addHeader("Access-Control-Allow-Origin", "*");
    response.addHeader("Access-Control-Allow-Headers", "Content-Type");
    response.setContentType("application/json; charset=UTF-8");
    String ip = request.getRemoteAddr();
    String query = URLDecoder.decode(request.getQueryString(), "UTF-8");
    System.out.println("Connected from " + ip + ".");
    if (!ip.equals("127.0.0.1")) {
      System.out.println("It was accessed from an incorrect IP address.");
      return;
    } 
    System.out.println("Body: " + query);

    JsonObject jsonObject = (new JsonParser()).parse(query).getAsJsonObject();
    String Detail = jsonObject.get("Detail").getAsString();
    String State = jsonObject.get("State").getAsString();
    String LargeImage = jsonObject.get("LargeImage").getAsString();
    String Url = jsonObject.get("url").getAsString();
    this.instance.connect(Detail, State , LargeImage , Url);
  }
}
