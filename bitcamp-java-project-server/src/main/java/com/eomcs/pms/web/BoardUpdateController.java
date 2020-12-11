package com.eomcs.pms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@Controller
public class BoardUpdateController {

  BoardService boardService;

  public BoardUpdateController(BoardService boardService) {
    this.boardService = boardService;
  }

  @RequestMapping("/board/update")
  public String execute(Board board) throws Exception {
    int count = boardService.update(board);

    if (count == 0) {
      throw new Exception("해당 번호의 게시글이 없습니다.");
    }
    return "redirect:list";
  }
}
