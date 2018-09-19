//ToDo def
import java.util.Scanner;

public class ToDo {
	Scanner inputDevice = new Scanner(System.in);
	public static int ToDoAmount = 0;
	boolean Done = false;
	String WhatToDo;
	
	public void addToDo(){
		ToDoAmount++;
		
	}
	public void markDone(){
		Done=true;
	}
	public void GetCount(){
		System.out.println("The amount of to do's" + ToDoAmount);
	}
	public void GetToDo()
	{
		WhatToDo=inputDevice.nextLine();
		System.out.println("What is the to do" + WhatToDo);
	}
}