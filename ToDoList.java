// to do list and main
import ToDo.*;
import java.util.Scanner;

public class ToDoList{
	public static void main ( String[] args){
		final int MAXTODOLIST = 5;
		char option = 'a';
		String todo = "";
		Scanner inputDevice = new Scanner(System.in);
	
		ToDo[] itemList = new ToDo[MAXTODOLIST];
		System.out.println("something");
		
		while (true){
			option = inputDevice.next().charAt(0);
			inputDevice.nextLine();
			
			
			if (option == 'a'){
		
			} else if (option == 'b'){
				System.out.println("Type your todo item");
				todo = inputDevice.nextLine();
				int count = ToDo.ToDoAmount;
				itemList[count] = new ToDo();
				// itemList[count].addToDo("Something")
				itemList[count].add(todo);
			} else if (option == 'c'){
				System.out.println ("You have "+ ToDo.ToDoAmount + "ToDo items.");
			}else if (option == 'd'){
		
			}else {
			
			}
		}
			
	}
}