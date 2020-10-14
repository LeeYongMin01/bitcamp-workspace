package com.eomcs.pms;

import java.net.Socket;

public class ClientHandler implements Runnable {
  Socket socket;

  public ClientHandler(Socket socket) {
    this.socket = socket;
  }

}