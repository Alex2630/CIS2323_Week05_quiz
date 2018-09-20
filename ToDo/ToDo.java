//ToDo def

package ToDo;
public class ToDo {
	
	public static int ToDoAmount = 0;
	private boolean isDone = false;
	private String WhatToDo;
	
	public void add(String item){
		WhatToDo=item;
		ToDoAmount++;
	}
	public void markDone(){
		isDone=true;
	}
	public int GetCount(){
		return ToDoAmount;
	}
	public String GetToDo(){
		
		return WhatToDo;
	}
}