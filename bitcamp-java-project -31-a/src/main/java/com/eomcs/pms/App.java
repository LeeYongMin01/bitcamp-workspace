package com.eomcs.pms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.handler.BoardAddCommand;
import com.eomcs.pms.handler.BoardDeleteCommand;
import com.eomcs.pms.handler.BoardDetailCommand;
import com.eomcs.pms.handler.BoardListCommand;
import com.eomcs.pms.handler.BoardUpdateCommand;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.HelloCommand;
import com.eomcs.pms.handler.MemberAddCommand;
import com.eomcs.pms.handler.MemberDeleteCommand;
import com.eomcs.pms.handler.MemberDetailCommand;
import com.eomcs.pms.handler.MemberListCommand;
import com.eomcs.pms.handler.MemberUpdateCommand;
import com.eomcs.pms.handler.ProjectAddCommand;
import com.eomcs.pms.handler.ProjectDeleteCommand;
import com.eomcs.pms.handler.ProjectDetailCommand;
import com.eomcs.pms.handler.ProjectListCommand;
import com.eomcs.pms.handler.ProjectUpdateCommand;
import com.eomcs.pms.handler.TaskAddCommand;
import com.eomcs.pms.handler.TaskDeleteCommand;
import com.eomcs.pms.handler.TaskDetailCommand;
import com.eomcs.pms.handler.TaskListCommand;
import com.eomcs.pms.handler.TaskUpdateCommand;
import com.eomcs.util.Prompt;

public class App {
 
  // main(), saveBoards(), loadBoards() 가 공유하는 필드
  static List<Board> boardList = new ArrayList<>();
  static File boardFile = new File("./board.csv"); // 게시글을 저장할 파일 정보
  
  // main(), saveMembers(), loadMember() 가 공유하는 필드
  static List<Member> memberList = new LinkedList<>();
  static File memberFile = new File("./member.csv"); // 회원을 저장할 파일 정보
  
  // main(), saveProjects(), loadProjects()가 공유하는 필드
  static List<Project> projectList = new LinkedList<>();
  static File projectFile = new File("./project.csv"); // 프로젝트를 저장할 파일 정보
  
  // main(), saveTasks(), loadTasks() 가 공유하는 필드 
  static List<Task> taskList = new ArrayList<>();
  static File taskFile = new File("./task.csv"); // 작업을 저장할 파일 정보
  
  public static void main(String[] args) {

    // 파일에서 데이터 로딩
    loadBoards();
    loadMembers();
    loadProjects();
    loadTasks();
    
    Map<String,Command> commandMap = new HashMap<>();
    
    commandMap.put("/board/add", new BoardAddCommand(boardList));
    commandMap.put("/board/list", new BoardListCommand(boardList));
    commandMap.put("/board/detail", new BoardDetailCommand(boardList));
    commandMap.put("/board/update", new BoardUpdateCommand(boardList));
    commandMap.put("/board/delete", new BoardDeleteCommand(boardList));
    
    MemberListCommand memberListCommand = new MemberListCommand(memberList);
    commandMap.put("/member/add", new MemberAddCommand(memberList));
    commandMap.put("/member/list", memberListCommand);
    commandMap.put("/member/detail", new MemberDetailCommand(memberList));
    commandMap.put("/member/update", new MemberUpdateCommand(memberList));
    commandMap.put("/member/delete", new MemberDeleteCommand(memberList));
    
    commandMap.put("/project/add", new ProjectAddCommand(projectList, memberListCommand));
    commandMap.put("/project/list", new ProjectListCommand(projectList));
    commandMap.put("/project/detail", new ProjectDetailCommand(projectList));
    commandMap.put("/project/update", new ProjectUpdateCommand(projectList, memberListCommand));
    commandMap.put("/project/delete", new ProjectDeleteCommand(projectList));

    commandMap.put("/task/add", new TaskAddCommand(taskList, memberListCommand));
    commandMap.put("/task/list", new TaskListCommand(taskList));
    commandMap.put("/task/detail", new TaskDetailCommand(taskList));
    commandMap.put("/task/update", new TaskUpdateCommand(taskList, memberListCommand));
    commandMap.put("/task/delete", new TaskDeleteCommand(taskList));

    commandMap.put("/hello", new HelloCommand());
    
    Deque<String> commandStack = new ArrayDeque<>();
    Queue<String> commandQueue = new LinkedList<>();
    
	 loop:
	  while(true) {
    	String inputStr = Prompt.inputString("명령> ");

    	if(inputStr.length() == 0) {
    	  continue;
    	}
    	
    	commandStack.push(inputStr);
    	commandQueue.offer(inputStr);
    	
    	switch(inputStr) {
    	case "history" : printCommandHistory(commandStack.iterator()); break;
    	case "history2" : printCommandHistory(commandQueue.iterator()); break;
    	case "exit":
    	case "quit":
    		System.out.println("안녕!");
    		break loop;
    	default:
    	  Command command = commandMap.get(inputStr);
    	  if(command != null) {
    	    try {
    	      command.execute();
    	    } catch(Exception e) {
              System.out.println("--------------------------------------------------------------");
              System.out.printf("명령어 실행 중 오류 발생: %s\n", e);
              System.out.println("--------------------------------------------------------------");
    	    }
    	  } else {
    		System.out.println("실행할 수 없는 명령입니다.");
    	  }
    	}
    	System.out.println();
	  }
    
  Prompt.close();
  
  // 데이터를 파일에 저장
  saveBoards();
  saveMembers();
  saveProjects();
  saveTasks();
 }
  
  static void printCommandHistory(Iterator<String> iterator) {
    try {
      int count = 0;
      while(iterator.hasNext()) {
        System.out.println(iterator.next());
        count++;

        if ((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch(Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }
  
  private static void saveBoards() {
    FileWriter out = null;

    try {
      // 파일로 데이터를 출력할 때 사용할 도구를 준비한다.
      out = new FileWriter(boardFile);

      for (Board board : boardList) {
        // 게시글 목록에서 게시글 데이터를 꺼내 CSV 형식으로 출력한다.
        String record = String.format("%d,%s,%s,%s,%s,%d\n", 
            board.getNo(),
            board.getTitle(),
            board.getContent(),
            board.getWriter(),
            board.getRegisteredDate(),
            board.getViewCount());
        out.write(record);
        // 주의!
        // - write() 는 String 을 출력할 때, 
        // - JVM 환경 변수 'file.encoding' 에 설정된 문자집합으로 
        //   인코딩하여 바이트 배열을 출력한다.
        // - JVM을 실행할 때 다음과 같이 실행하면 이 환경 변수의 값을 설정할 수 있다.
        //      $ java -d bin/main -Dfile.encoding=UTF-8 ...
        // - 이클립스에서 자바 프로그램을 실행하면 위와 같이 JVM 환경 변수가 자동으로 추가된다.
        // - 만약 CLI(command line interface; 콘솔, 명령창, 파워셀) 에서 저 옵션없이 실행한다면
        //   운영체제에 따라 다음과 같이 자동으로 문자집합이 설정된다.
        //      Windows: MS949
        //      Linux/macOS/Unix: UTF-8
        //
      }
      System.out.printf("총 %d 개의 게시글 데이터를 저장했습니다.\n", boardList.size());

    } catch (IOException e) {
      System.out.println("게시글 데이터의 파일 쓰기 중 오류 발생! - " + e.getMessage());

    } finally {
      try {
        out.close();
      } catch (IOException e) {
        // FileWriter를 닫을 때 발생하는 예외는 무시한다.
      }
    }
  }

  private static void loadBoards() {
    Scanner in = null;

    try {
      // 파일을 읽을 때 사용할 도구를 준비한다.
      in = new Scanner(new FileReader(boardFile));

      while (true) {
        try {
          // 파일에서 한 줄 읽는다.
          String record = in.nextLine();

          // 콤마로 각 데이터를 분리한다.
          String[] fields = record.split(",");

          // 데이터가 저장된 순서대로 읽어서 객체에 저장한다.
          Board board = new Board();
          board.setNo(Integer.parseInt(fields[0]));
          board.setTitle(fields[1]);
          board.setContent(fields[2]);
          board.setWriter(fields[3]);
          board.setRegisteredDate(Date.valueOf(fields[4]));
          board.setViewCount(Integer.parseInt(fields[5]));

          // 게시글 객체를 Command가 사용하는 목록에 저장한다.
          boardList.add(board);
        } catch (NoSuchElementException e) {
          break;
        }
      }
      System.out.printf("총 %d 개의 게시글 데이터를 로딩했습니다.\n", boardList.size());

    } catch (Exception e) {
      System.out.println("게시글 파일 읽기 중 오류 발생! - " + e.getMessage());
      // 파일에서 데이터를 읽다가 오류가 발생하더라도
      // 시스템을 멈추지 않고 계속 실행하게 한다.
      // 이것이 예외처리를 하는 이유이다!!!
    } finally {
      try {
        in.close();
      } catch (Exception e) {
        // close() 실행하다가 오류가 발생한 경우 무시한다.
        // 왜? 닫다가 발생한 오류는 특별히 처리할 게 없다.
      }
    }
  }
  
  private static void saveMembers() {
    FileWriter out = null;
    
    try {
      out = new FileWriter(memberFile);
      
      for(Member member : memberList) {
        // 회원 목록에서 회원 데이터를 꺼내 CSV 형식으로 출력한다.
        String record = String.format("%d,%s,%s,%s,%s,%s,%s\n", 
            member.getNo(),
            member.getName(),
            member.getEmail(),
            member.getPassword(),
            member.getPhoto(),
            member.getTel(),
            member.getRegisteredDate());
        
        out.write(record);
    }
      System.out.printf("총 %d 개의 회원 데이터를 저장했습니다.\n", memberList.size());
      
    } catch (IOException e) {
      System.out.println("회원 데이터의 파일 쓰기 중 오류 발생! - " + e.getMessage());
      
    } finally {
      try {
        out.close();
      } catch (IOException e) {
        
      }
    }
  }
  
  private static void loadMembers() {
    Scanner in = null;
    
    try {
      in = new Scanner(new FileReader(memberFile));
      
      while(true) {
        try {
          String record = in.nextLine();
          String[] fields = record.split(",");
          
          Member member = new Member();
          member.setNo(Integer.parseInt(fields[0]));
          member.setName(fields[1]);
          member.setEmail(fields[2]);
          member.setPassword(fields[3]);
          member.setPhoto(fields[4]);
          member.setTel(fields[5]);
          member.setRegisteredDate(Date.valueOf(fields[6]));
          
          memberList.add(member);
        } catch (Exception e) {
          break;
        }
      }
      System.out.printf("총 %d 개의 회원 데이터를 로딩했습니다.\n", memberList.size());
      
    } catch (Exception e) {
      System.out.println("회원 파일 읽기 중 오류 발생! - " + e.getMessage());
      
    } finally {
      try {
        in.close();
      } catch (Exception e) {
        
      }
    }
  }
  
  private static void saveProjects() {
    FileWriter out = null;
    
    try {
      out = new FileWriter(projectFile);
      

      for (Project project : projectList) {
        // 프로젝트 목록에서 프로젝트 데이터를 꺼내 CSV 형식으로 출력한다.
        String record = String.format("%d,%s,%s,%s,%s,%s,%s\n", 
            project.getNo(),
            project.getTitle(),
            project.getContent(),
            project.getStartDate(),
            project.getEndDate(),
            project.getOwner(),
            project.getMembers());
        
        out.write(record);
      }
      System.out.printf("총 %d 개의 프로젝트 데이터를 저장했습니다.\n", projectList.size());

  } catch (IOException e) {
    System.out.println("프로젝트 데이터의 파일 쓰기 중 오류 발생! - " + e.getMessage());
  
  } finally {
    try {
      out.close();
    } catch (IOException e) {
      
    }
  }
  } 
  
  private static void loadProjects() {
    Scanner in = null;
    
    try {
      in = new Scanner(new FileReader(projectFile));
      
      while (true) {
        try {
          String record = in.nextLine();
          String[] fields = record.split(",");

          Project project = new Project();
          project.setNo(Integer.parseInt(fields[0]));
          project.setTitle(fields[1]);
          project.setContent(fields[2]);
          project.setStartDate(Date.valueOf(fields[3]));
          project.setEndDate(Date.valueOf(fields[4]));
          project.setOwner(fields[5]);
          project.setMembers(fields[6]);
      
        projectList.add(project);
      } catch (Exception e) {
        break;
      }
      }
      System.out.printf("총 %d 개의 프로젝트 데이터를 로딩했습니다.\n", projectList.size());
   
    } catch (Exception e) {
      System.out.println("프로젝트 파일 읽기 중 오류 발생! - " + e.getMessage());
    } finally {
      try {
        in.close();
      } catch (Exception e) {
        
      }
    }
  }
  
  private static void saveTasks() {
    FileWriter out = null;

    try {
      out = new FileWriter(taskFile);

      for (Task task : taskList) {
        // 작업 목록에서 작업 데이터를 꺼내 CSV 형식으로 출력한다.
        String record = String.format("%d,%s,%s,%d,%s\n", 
            task.getNo(),
            task.getContent(),
            task.getDeadline(),
            task.getStatus(),
            task.getOwner());
        
        out.write(record);
      }
      System.out.printf("총 %d 개의 작업 데이터를 저장했습니다.\n", taskList.size());

    } catch (IOException e) {
      System.out.println("작업 데이터의 파일 쓰기 중 오류 발생! - " + e.getMessage());

    } finally {
      try {
        out.close();
      } catch (IOException e) {
      }
    }
  }

  private static void loadTasks() {
    Scanner in = null;

    try {
      in = new Scanner(new FileReader(taskFile));

      while (true) {
        try {
          String record = in.nextLine();
          String[] data = record.split(",");

          Task task = new Task();
          task.setNo(Integer.parseInt(data[0]));
          task.setContent(data[1]);
          task.setDeadline(Date.valueOf(data[2]));
          task.setStatus(Integer.parseInt(data[3]));
          task.setOwner(data[4]);

        taskList.add(task);
      } catch (Exception e) {
        break;
      }
      }
      System.out.printf("총 %d 개의 작업 데이터를 로딩했습니다.\n", taskList.size());

    } catch (Exception e) {
      System.out.println("작업 파일 읽기 중 오류 발생! - " + e.getMessage());
    } finally {
      try {
        in.close();
      } catch (Exception e) {
      }
    }
  }
}
    
