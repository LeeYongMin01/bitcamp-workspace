package com.eomcs.pms.domain;

import java.sql.Date;
import com.eomcs.util.CsvObject;

  // 회원 데이터
  public class Member implements CsvObject {
    private int no;
    private String name;
    private String email;
    private String password;
    private String photo;
    private String tel;
    private Date registeredDate;
    
    public int getNo() {
      return no;
    }
    public void setNo(int no) {
      this.no = no;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public String getPassword() {
      return password;
    }
    public void setPassword(String password) {
      this.password = password;
    }
    public String getPhoto() {
      return photo;
    }
    public void setPhoto(String photo) {
      this.photo = photo;
    }
    public String getTel() {
      return tel;
    }
    public void setTel(String tel) {
      this.tel = tel;
    }
    public Date getRegisteredDate() {
      return registeredDate;
    }
    public void setRegisteredDate(Date registeredDate) {
      this.registeredDate = registeredDate;
    }
  
    @Override
  public String toCsvString() {
    
  return String.format("%d,%s,%s,%s,%s,%s,%s\n", 
      this.getNo(),
      this.getName(),
      this.getEmail(),
      this.getPassword(),
      this.getPhoto(),
      this.getTel(),
      this.getRegisteredDate());
  }
  
  public static Member valueOfCsv(String csv) {
    String[] fields = csv.split(",");
    
    Member member = new Member();
    member.setNo(Integer.parseInt(fields[0]));
    member.setName(fields[1]);
    member.setEmail(fields[2]);
    member.setPassword(fields[3]);
    member.setPhoto(fields[4]);
    member.setTel(fields[5]);
    member.setRegisteredDate(Date.valueOf(fields[6]));
    
    return member;
  }
  
  // 다른 생성자가 있으면 컴파일러가 기본 생성자를 만들어주지 않으니까
  // 다음과 같이 별도로 만들어야 한다.
  public Member() {}

  // CSV 문자열을 받아 인스턴스 필드를 초기화시키는 생성자
  public Member(String csv) {
    String[] fields = csv.split(",");

    this.setNo(Integer.parseInt(fields[0]));
    this.setName(fields[1]);
    this.setEmail(fields[2]);
    this.setPassword(fields[3]);
    this.setPhoto(fields[4]);
    this.setTel(fields[5]);
    this.setRegisteredDate(Date.valueOf(fields[6]));
  }
}
