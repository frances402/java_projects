
public class BankCheckingAccount_Lee extends BankAccount_Lee {
	private float limitAmount;
	private float serviceFee;
	
	public BankCheckingAccount_Lee() {
		this.limitAmount=0;
		this.serviceFee=0;
	}
	public BankCheckingAccount_Lee(String number, float balance,float limitAmount, float serviceFee){
		super(number,balance);
		this.limitAmount=limitAmount;
		this.serviceFee=serviceFee;
	}
	
	public void withdraw(double amt){
		if(super.balance-amt > this.limitAmount){	
			float newbal =super.balance-=amt;
			super.setBalance(newbal);
			System.out.println("Withdraw amount: "+ amt);
			System.out.println("New Balance: "+ newbal);}
		else {
			System.out.println("Withdraw amount: "+ super.balance+" - denied");
			System.out.println("Current Balance: "+ super.balance);
		}
	}
	
	public float getLimit(){
		return limitAmount;
	}
	public void setLimit(float limitAmount){
		this.limitAmount=limitAmount;
	}
	public float getFee(){
		return serviceFee;
	}
	public void setFee(float serviceFee){
		this.serviceFee=serviceFee;
	}
	
	public void checkCurrentBalance() {
		System.out.println("Account Type: Checking Account");  
		super.checkCurrentBalance();
    }

	public void statement() {
		this.checkCurrentBalance();
		System.out.println("Limit Amount:\t$"+this.limitAmount);
        System.out.println("Service Fee:\t$"+serviceFee);
   
    }
	
}
