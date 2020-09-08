package com.eomcs.pms.handler;

import java.util.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {

  BoardList boardList = new BoardList();
  
  public void add() {
    System.out.println("[게시글 등록]");
    
    Board board = new Board();
    board.setNo(Prompt.inputInt("번호? "));
    board.setTitle(Prompt.inputString("제목? "));
    board.setContent(Prompt.inputString("내용? "));
    board.setWriter(Prompt.inputString("작성자? "));
    board.setRegisteredDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);
    
    boardList.add(board);
    
    System.out.println("게시글을 등록하였습니다.");
  }
  
  public void list() {
    System.out.println("[게시글 목록]");
    
    Board[] boards = boardList.toArray();
    
    for(Board board : boards) {
      System.out.printf("%d, %s, %s, %s, %d\n",
        board.getNo(), 
        board.getTitle(), 
        board.getWriter(), 
        board.getRegisteredDate(), 
        board.getViewCount());
    
  }
 }
}

