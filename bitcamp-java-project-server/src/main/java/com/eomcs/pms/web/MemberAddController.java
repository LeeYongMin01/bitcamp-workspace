package com.eomcs.pms.web;

import java.util.UUID;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;
import net.coobird.thumbnailator.ThumbnailParameter;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import net.coobird.thumbnailator.name.Rename;

@Controller
public class MemberAddController {

  ServletContext servletContext; // 메서드의 파라미터로 받지 못한다.
  MemberService memberService;


  public MemberAddController(
      MemberService memberService,
      ServletContext servletContext) { // 이렇게 생성자에서 받아야 한다.
    this.memberService = memberService;
    this.servletContext = servletContext;
  }

  @RequestMapping("/member/add")
  public String execute(Member member, Part photoFile, HttpServletResponse response) throws Exception {

    String filename = UUID.randomUUID().toString();
    String saveFilePath = servletContext.getRealPath("/upload/" + filename);

    photoFile.write(saveFilePath);
    member.setPhoto(filename);

    generatePhotoThumbnail(saveFilePath);

    memberService.add(member);
    return "redirect:list";
  }
}
