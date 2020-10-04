package com.eomcs.pms.domain;

import java.sql.Date;
import com.eomcs.util.CsvObject;

  // 프로젝트 데이터
  public class Project implements CsvObject {
    private int no;
    private String title;
    private String content;
    private Date startDate;
    private Date endDate;
    private String owner;
    private String members;
    
    public int getNo() {
      return no;
    }
    public void setNo(int no) {
      this.no = no;
    }
    public String getTitle() {
      return title;
    }
    public void setTitle(String title) {
      this.title = title;
    }
    public String getContent() {
      return content;
    }
    public void setContent(String content) {
      this.content = content;
    }
    public Date getStartDate() {
      return startDate;
    }
    public void setStartDate(Date startDate) {
      this.startDate = startDate;
    }
    public Date getEndDate() {
      return endDate;
    }
    public void setEndDate(Date endDate) {
      this.endDate = endDate;
    }
    public String getOwner() {
      return owner;
    }
    public void setOwner(String owner) {
      this.owner = owner;
    }
    public String getMembers() {
      return members;
    }
    public void setMembers(String members) {
      this.members = members;
    }
    
    @Override
    public String toCsvString() {
      return String.format("%d,%s,%s,%s,%s,%s,%s\n", 
          this.getNo(),
          this.getTitle(),
          this.getContent(),
          this.getStartDate(),
          this.getEndDate(),
          this.getOwner(),
          this.getMembers());
    }
    
    public static Project valueOfCsv(String csv) {
      String[] fields = csv.split(",");

      Project project = new Project();
      project.setNo(Integer.parseInt(fields[0]));
      project.setTitle(fields[1]);
      project.setContent(fields[2]);
      project.setStartDate(Date.valueOf(fields[3]));
      project.setEndDate(Date.valueOf(fields[4]));
      project.setOwner(fields[5]);
      project.setMembers(fields[6]);
  
      return project;
    }
    
    // 다른 생성자가 있으면 컴파일러가 기본 생성자를 만들어주지 않으니까
    // 다음과 같이 별도로 만들어야 한다.
    public Project() {}

    // CSV 문자열을 받아 인스턴스 필드를 초기화시키는 생성자
    public Project(String csv) {
      String[] fields = csv.split(",");

      this.setNo(Integer.parseInt(fields[0]));
      this.setTitle(fields[1]);
      this.setContent(fields[2]);
      this.setStartDate(Date.valueOf(fields[3]));
      this.setEndDate(Date.valueOf(fields[4]));
      this.setOwner(fields[5]);
      this.setMembers(fields[6]);
    }
  }

