package com.skilldistillery.makechange;
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double itemPrice, cashTotal, cashChange;
		int  tenBill, fiveBill, oneBill, dime, nickel, penny;

		
		//		User Story #1
//
//		The user is prompted asking for the price of the item.
		System.out.println("How much does the item cost?: ");
		itemPrice = input.nextDouble();
//		User Story #2
//
//		The user is then prompted asking how much money was tendered by the customer.
		System.out.println("How much cash was handed to you?: ");
		cashTotal = input.nextDouble();
//		User Story #3
//
//		Display an appropriate message if the customer provided too little money or the exact amount.
		
		if(cashTotal == itemPrice) {
			System.out.println("The customer provided the exact amount of money");
		}else if(cashTotal < itemPrice) {
			System.out.println("The customer did not provide enough money");
		}else if(cashTotal > itemPrice) {
			cashChange = cashTotal - itemPrice;
			
			
		}
//		User Story #4
//
//		If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
	}

}
