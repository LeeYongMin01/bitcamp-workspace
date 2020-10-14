package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientApp {
    public static void main(String[] args) {

      try (Socket socket = new Socket("localhost", 8888);
          PrintWriter out = new PrintWriter(socket.getOutputStream());
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

        out.println("Hello!");
        out.flush();

        String response = in.readLine();
        System.out.println(response);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}
