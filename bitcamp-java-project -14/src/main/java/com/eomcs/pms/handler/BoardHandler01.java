/*package com.eomcs.pms.handler;

import java.util.Date;
import com.eomcs.pms.handler.BoardList.Board;
import com.eomcs.util.Prompt;

public class BoardHandler01 {

  // BoardHandler가 사용할 BoardList 객체를 준비한다.
  BoardList boardList = new BoardList();
  
  public void add() {
    System.out.println("[게시글 등록]");
    
//    BoardList.Board board = new BoardList.Board();
//    board.no = Prompt.inputInt("번호? ");
//    board.title = Prompt.inputString("제목? ");
//    board.content= Prompt.inputString("내용? ");
//    board.writer = Prompt.inputString("작성자? ");
//    board.registeredDate = new Date(System.currentTimeMillis());
//    board.viewCount = 0;
    
    boardList.add(board);
    
    System.out.println("게시글을 등록하였습니다.");
  }
  
  public void list() {
    System.out.println("[게시글 목록]");
    
    BoardList.Board[] boards = boardList.toArray();
    
    for(Board board : boards) {
      System.out.printf("%d, %s, %s, %s, %d\n",
        board.no, board.title, board.writer, board.registeredDate, board.viewCount);
    
  }
 }
}
*/
