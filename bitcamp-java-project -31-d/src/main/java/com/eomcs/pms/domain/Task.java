package com.eomcs.pms.domain;

import java.sql.Date;
import com.eomcs.util.CsvObject;

// 작업 데이터
public class Task implements CsvObject {
  private int no;
  private String content;
  private Date deadline;
  private String owner;
  private int status;
  
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Date getDeadline() {
    return deadline;
  }
  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }
  public int getStatus() {
    return status;
  }
  public void setStatus(int status) {
    this.status = status;
  }
  
  @Override
  public String toCsvString() {
    return String.format("%d,%s,%s,%d,%s\n", 
        this.getNo(),
        this.getContent(),
        this.getDeadline(),
        this.getStatus(),
        this.getOwner());
  }
  
  public static Task valueOfCsv(String csv) {
    String[] data = csv.split(",");

    Task task = new Task();
    task.setNo(Integer.parseInt(data[0]));
    task.setContent(data[1]);
    task.setDeadline(Date.valueOf(data[2]));
    task.setStatus(Integer.parseInt(data[3]));
    task.setOwner(data[4]);

    return task;
  }
  
  // 다른 생성자가 있으면 컴파일러가 기본 생성자를 만들어주지 않으니까
  // 다음과 같이 별도로 만들어야 한다.
  public Task() {}

  // CSV 문자열을 받아 인스턴스 필드를 초기화시키는 생성자
  public Task(String csv) {
    String[] data = csv.split(",");

    this.setNo(Integer.parseInt(data[0]));
    this.setContent(data[1]);
    this.setDeadline(Date.valueOf(data[2]));
    this.setStatus(Integer.parseInt(data[3]));
    this.setOwner(data[4]);
  }
}

