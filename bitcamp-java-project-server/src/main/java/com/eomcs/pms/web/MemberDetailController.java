package com.eomcs.pms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@Controller
public class MemberDetailController {

  MemberService memberService;

  public MemberDetailController(MemberService memberService) {
    this.memberService = memberService;
  }

  @RequestMapping("/member/detail")
  public ModelAndView execute(int no) throws Exception {
    Member member = memberService.get(no);
    if (member == null) {
      throw new Exception("해당 회원이 없습니다!");
    }

    ModelAndView mv = new ModelAndView();
    mv.addObject("member", member);
    mv.setViewName("/member/detail.jsp");
    return mv;
  }
}
