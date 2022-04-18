
public class BankSavingAccount_Lee extends BankAccount_Lee {
	private float limitAmount;
	private float interestRate;
	
	public BankSavingAccount_Lee() {
		this.limitAmount=0;
		this.interestRate=0;
	}
	public BankSavingAccount_Lee(String number, float balance, float limitAmount, float interestRate){
		super(number,balance);
		this.limitAmount=limitAmount;
		this.interestRate=interestRate;
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
	public float getInterest(){
		return interestRate;
	}
	public void setInterest(float interestRate){
		this.interestRate=interestRate;
	}
	
    public void checkCurrentBalance() {
    	System.out.println("Type: Saving Account");
        super.checkCurrentBalance();     
    } 

    public void statement(){
        this.checkCurrentBalance();
        System.out.println("Limit Amount:\t$"+ this.limitAmount);
        System.out.println("Interest Rate:\t"+interestRate+"%");
        float balance=super.getBalance();
        super.setBalance(balance*interestRate);
    }

}
