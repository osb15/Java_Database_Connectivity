package com.java;

import java.util.Scanner;

public class Jdbc_PrepareStaement {

	public static void main(String[] args) {

		PrepareStatemaent p =new PrepareStatemaent();
		int option;
		do {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Choose Your Option:");
			System.out.println("1)INSERT DATA.\n2)UPDATE DATA.\n3)DELETE DATA\n4)DISPLAY DATA.\n5)EXIT.");
			
			option=sc.nextInt();
			
			
			switch(option) {
			
			case 1 :p.insert();
			break;
			
			case 2 :p.Update();
			break;
			
			case 3:p.Delete(); 
			break;
			
			case 4:p.Display();
			break;
			
			case 5:sc.close();
			System.out.println("Exit Program.");
			break;
			
			}		
			
		}while(option!=5);
		
		

	}

}