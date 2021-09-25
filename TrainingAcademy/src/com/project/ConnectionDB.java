
package com.project;

import java.util.Scanner;

import com.controller.Client;

public class ConnectionDB {
	
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int ch=0;
		
		do {
			System.out.println("****************WelCome To Training Academy**********************");
			System.out.println("1. Students Section");
			System.out.println("2. Trainers Section");
			System.out.println("3. Batchs Section");
			System.out.println("4. Institute Result Section");
			System.out.println("5.Exit");
			System.out.println("");
			System.out.println("Choose Option (1/2)");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					enrollStud();
					break;
				case 2:
					enrollTrainer();
					break;
				case 3:
					enrollBatch();
					break;
				case 4:
					getResults();
					break;
				case 5:
					break;
				default:
					System.out.print("Plesce Enter Valid Number");
					
					
					
			}
			
			
		}while(ch!=5);
		System.out.println("Thanks for Using our Softeware");
//		System.out.println("1.Add New Student");
//		System.out.println("2.Modify Student Details");
//		System.out.println();
//		//Client c=new Client();

	}
	static void enrollStud() {
		Client c=new Client();
		c.allStudent();
//		System.out.print("Choose Batch :");
//		int ch=sc.nextInt();
//		
//		c.enterStud(ch);
	}
	static void enrollTrainer() {
		Client c=new Client();
//		c.enterTrainer();
		c.allTrainers();
	}

	static void enrollBatch() {
		Client c=new Client();
		c.allBatches();
	}
	static void getResults() {
		Client c=new Client();
		c.getResults();
	}
}
