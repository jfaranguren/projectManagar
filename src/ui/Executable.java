package ui;

import java.util.util;
import model.Controller;


public class Executable{
	
	private Scanner reader;
	private Controller control;

	public Executable(){
		
		reader = new Scanner(System.in);
		control = new Controller();
		
	}

	public static void main (String[] args){
		
		Executable exe = new Executable();
		exe.menu();
		
		
	}
	
	public void menu(){
		
		System.out.println("Welcome to Icesi Project Manager");
		
		
		
		
	}
	
	


	
	
	
	
}
