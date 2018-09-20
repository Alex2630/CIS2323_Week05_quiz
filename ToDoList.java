// to do list and main
import ToDo.*;
import java.util.Scanner;

public class ToDoList{
	public static void main ( String[] args ){
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
				for (int i = 0; i < ToDo.ToDoAmount; i++){
					System.out.println( (i+1) + "ToDo: " + itemList[i].getToDo());
				}
			} else if (option == 'b'){
				System.out.println("Type your todo item");
				todo = inputDevice.nextLine();
				int count = ToDo.ToDoAmount;
				itemList[count] = new ToDo(todo);
			
			} else if (option == 'c'){
				System.out.println ("You have "+ ToDo.ToDoAmount + "ToDo items.");
			} else if (option == 'd'){
				System.out.println("Which item is complete?");
				int d = inputDevice.nextInt();
				inputDevice.nextLine();
				itemList[(d-1)].markDone();
		
			}
		}	
	}
}