/*
 Implement two custom exceptions, InvalidAmountException and
InsufficientFundException, to handle different error scenarios
during account transactions. Additionally, create the necessary
classes and methods to simulate this banking scenario.

InvalidAmountException:
Create a custom checked exception named InvalidAmountException that
extends Exception.
Implement a constructor that takes a String message parameter and
passes it to the superclass constructor.

InsufficientFundException:
Create a custom checked exception named InsufficientFundException that
extends Exception.
Implement a constructor that takes a String message parameter and passes
it to the superclass constructor.

BankAccount Class:
Create a class named BankAccount representing a customer's bank
account with the following attributes:
accountNumber (String): Unique account number.
balance (double): Current account balance.

Implement a constructor to initialize the accountNumber and balance.

Implement a method deposit(double amount) that allows a customer to
deposit money in their account.
If the amount is negative or zero, throw an InvalidAmountException.

Implement a method withdraw(double amount) that allows a customer to
withdraw money from their account.
If the amount is negative or zero, throw an InvalidAmountException.
If the amount exceeds the available balance, throw an InsufficientFundException.

BankingApplication Class:
Create a class named BankingApplication to simulate account operations.
Instantiate a BankAccount object for a customer.
Demonstrate withdrawal operations with different amounts, catching
and handling appropriate exceptions.
 */
package com.nit.ExceptionHandling;

class InvalidAmountException extends Exception{
	String  message;
	public InvalidAmountException(String  message){
		super(message);
	}
	InvalidAmountException(){}
}
class InsufficientFundException extends Exception{
	String  message;
public	InsufficientFundException(String  message){
		super(message);
		}
		InsufficientFundException(){
		
}
}
class BankAccount{
	String accountNumber;
	double balance;
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposite(double amount) throws InvalidAmountException{
		
		if(amount<=0) {
			throw new InvalidAmountException("enter the valid number...");
		}
		balance+=amount;
		System.out.println(amount+"deposited");
	}
	public void withdraw(double amount)  throws InvalidAmountException ,InsufficientFundException{
		if(amount<=0) {
			throw new InvalidAmountException("enter the valid number...");
		}
		if(amount>balance) {
				throw new  InsufficientFundException("enter below the amount... "); 
			
		}
	balance-=amount;
	System.out.println(amount+"withdraw");
	}
	public double getAmount() {
		return balance;
	}
}
public class Bank {

	public static void main(String[] args)throws  InvalidAmountException ,InsufficientFundException{
		BankAccount ba=new BankAccount("456456215",4563.00);
		try {
		ba.withdraw(1500);
		System.out.println("amount is :"+ba.getAmount());
		}
		catch(InsufficientFundException ie) {
			System.out.println(ie.getMessage());
		}

	}
}

