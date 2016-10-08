import java.util.Scanner;

public class runStack{
	public static void main(String[] args){
		StackADT newStack = new ArrayStack();
		String option;
		System.out.println("Hello! Please choose from the following options \n"
				+ " - Press T to check the top element of your stack \n"
				+ " - Press P to remove the first element of the stack \n"
				+ " - Press E to check if your stack is empty \n"
				+ " - Press S to check the size of your stack \n"
				+ " - Press A to add an element to your stack \n"
				+ " - Press Q to Quit \n");
			do {
			   		System.out.println("Your command: ");
			   		Scanner s = new Scanner(System.in);
			   		option = s.nextLine().trim().toUpperCase(); 
			   		try{
					switch(option){
				
					case "T": Object topE = newStack.top();
						      System.out.println("The top element of your stack is: " + topE);
							  break;
							  
					case "P": Object lastE = newStack.top();
						   	newStack.pop();
							if(newStack.isEmpty()){
								  System.out.println("Your stack is now empty");
								  }
							else {
								  topE = newStack.top();
								  System.out.println("The top element of your stack is now: " + topE);
							     }
						    System.out.println("The popped element is: " + lastE);
							break;
							  
					case "E": boolean empty = newStack.isEmpty();
							  if(empty == true){
								  System.out.println("Your stack is empty!");
								  } 
							  else{
								  System.out.println("Your stack is not empty!");
							  	  }
							  break;
							  
					case "S": int size = newStack.size();
							  System.out.println("The size your stack is: " + size );
							  break;
							  
					case "A": System.out.println("Input the string you would like to add to your stack: ");
							  String newElement = s.nextLine(); 
							  newStack.push(newElement);
							  topE = newStack.top();
							  System.out.println("The top element of your stack is now: " + topE);
							  break;
					case "Q": System.out.println("Goodbye!");
							  break;
							  
					default:  System.out.println("Please enter a vaild command");
					  		  break;
					}
			  }
			 catch(FullStackException e){
				 	System.out.println("Stack is full, so cannot push on to stack, please try again");
			 }
			 catch(EmptyStackException e){
				 	System.out.println("Stack is empty, so cannot pop or read from stack, please try again");
			 }
			   		
	   	}
		while(!option.equals("Q"));
	}
}
