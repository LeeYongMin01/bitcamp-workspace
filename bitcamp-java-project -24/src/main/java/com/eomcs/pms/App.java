package com.eomcs.pms;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.ArrayList;
import com.eomcs.util.LinkedList;
import com.eomcs.util.List;
import com.eomcs.util.Prompt;
import com.eomcs.util.Queue;
import com.eomcs.util.Stack;

public class App {

  public static void main(String[] args) {
    
    List<Board> boardList = new ArrayList<>();
    BoardHandler boardHandler = new BoardHandler(boardList);
    
    List<Member> memberList = new LinkedList<>();
    MemberHandler memberHandler = new MemberHandler(memberList);
    
    List<Project> projectList = new LinkedList<>();
    ProjectHandler projectHandler = new ProjectHandler(projectList, memberHandler);
    
    List<Task> taskList = new ArrayList<>();
    TaskHandler taskHandler = new TaskHandler(taskList, memberHandler);
    
    Stack<String> commandStack = new Stack<>();
    Queue<String> commandQueue = new Queue<>();
    
	 loop:
	  while(true) {
    	String command = Prompt.inputString("명령> ");

    	commandStack.push(command);
    	commandQueue.offer(command);
    	
    	switch(command) {
    	case "/member/add": memberHandler.add(); break;
    	case "/member/list": memberHandler.list(); break;
        case "/member/detail": memberHandler.detail(); break;
        case "/member/update": memberHandler.update(); break;
        case "/member/delete": memberHandler.delete(); break;
    	case "/project/add": projectHandler.add(); break;
    	case "/project/list": projectHandler.list(); break;
        case "/project/detail": projectHandler.detail(); break;
        case "/project/update": projectHandler.update(); break;
        case "/project/delete": projectHandler.delete(); break;
    	case "/task/add": taskHandler.add(); break;
    	case "/task/list": taskHandler.list(); break;
        case "/task/detail": taskHandler.detail(); break;
        case "/task/update": taskHandler.update(); break;
        case "/task/delete": taskHandler.delete(); break;
    	case "/board/add": boardHandler.add(); break;
    	case "/board/list": boardHandler.list(); break;
    	case "/board/detail": boardHandler.detail(); break;
    	case "/board/update": boardHandler.update(); break;
    	case "/board/delete": boardHandler.delete(); break;
    	case "history" : printCommandHistory(commandStack); break;
    	case "history2" : printCommandHistory2(commandQueue); break;
    	case "exit":
    	case "quit":
    		System.out.println("안녕!");
    		break loop;
    	default:
    		System.out.println("실행할 수 없는 명령입니다.");
    	}
    	System.out.println();
	  }
    
  Prompt.close();
 }
  
  static void printCommandHistory(Stack<String> commandStack) {
    try {
      Stack<String> history = commandStack.clone();
      
      int count = 0;
      while(!history.empty()) {
        System.out.println(history.pop());
        count++;

        if ((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch(Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }
  
  static void printCommandHistory2(Queue<String> commandQueue) {
    try {
      Queue<String> history = commandQueue.clone();
      
      int count = 0;
      while(history.size() > 0) {
        System.out.println(history.poll());
        count++;
        
        if((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch(Exception e) {
      System.out.println("history2 명령 처리 중 오류 발생!");
    }
  }
}
    
