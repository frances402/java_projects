public class BankAccount_Lee{

	protected String number;
	protected float balance;
	public BankAccount_Lee() {
		this.number="";
		this.balance=0;
	}
	
	public BankAccount_Lee(String number, float balance){
		this.number=number;
		this.balance=balance;
	}
	
	public String getNumber(){
		return number;
	}
	
	public void setNumber(String number){
		this.number=number;
	}
	
	 public float getBalance(){
	    return balance;
	 }
	    
	 public void setBalance(float balance){
	    this.balance=balance;
	 }
	 
	 public void deposit(double amt){
	   float newbal= balance+=amt;
	   System.out.println("Deposit amount: "+ amt);
	   System.out.println("New Balance: "+ newbal);
	    
	 }
	    
	 public void withdraw(double amt){
	    balance-=amt;
	 }
	    
	 public void checkCurrentBalance(){
		System.out.println(toString());
	 }
	    
	 public void statement(){
		System.out.println(toString());
	 }
	 
	 public String toString(){
		 return "Account Number:\t"+number+"\nCurrent Balance:$"+ balance;
	 }
}
