package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import com.eomcs.util.Prompt;

public class ClientApp {
    public static void main(String[] args) {

      try (Socket socket = new Socket("localhost", 8888);
          PrintWriter out = new PrintWriter(socket.getOutputStream());
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

        while(true) {

        String input = Prompt.inputString("명령> ");
        out.println(input);
        out.flush();

        receiveResponse(in);

        if(input.equalsIgnoreCase("quit"))
          break;

        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    private static void receiveResponse(BufferedReader in) throws Exception {
      while(true) {
        String response = in.readLine();
        if(response.length() == 0)
          break;
        System.out.println(response);
      }
    }
}
