//ToDo def

package todo;
public class ToDo {
	
	public static int ToDoAmount = 0;
	
	private boolean isDone = false;
	private String WhatToDo;
	
	public void addToDo(String i){
		ToDoAmount=i;
		count ++;
	}
	public void markDone(){
		isDone=true;
	}
	public int GetCount(){
		return ToDoAmount;
	}
	public String GetToDo()
	{
		
		return WhatToDo;
	}
}