import java.util.*;
import java.io.*;
public class COSC2436_FA2018_BANKSERVICE_LEE{
	Scanner keyboard = new Scanner(System.in);
	public int e;
	public int c;
	public int l;
	public COSC2436_FA2018_BANKSERVICE_LEE() {
	}
	public void taskem(){
		System.out.println("TASKS FOR BANK EMPLOYEES");
		System.out.println("1. Add a New Customer - Open New Account");
		System.out.println("2. Display a Customer With All Accounts");
		System.out.println("3. Open New Account for Current Customer");
		System.out.println("4. Read One Account for One Customer");
		System.out.println("5. Remove One Account of Current Customer");
		System.out.println("6. Display all Customers with their accounts");
		System.out.println("7. Process Monthly Statement");
		System.out.println("0. DONE");
		System.out.println("Enter your Choice");
		e= keyboard.nextInt();
	}
	public void taskcu(){
		System.out.println("TASKS FOR BANK CUSTOMERS");
		System.out.println("1. Print Information of Customer");
		System.out.println("2. Check Balance");
		System.out.println("3. Deposit");
		System.out.println("4. WithDraw");
		System.out.println("5. Print Monthly Statement");
		System.out.println("0. DONE");
		System.out.println("Enter your Choice");
		c= keyboard.nextInt();
	}
	public void login(){
		System.out.println("SELECT LOGIN TYPE");
		System.out.println("1. Customer id");
		System.out.println("2. Username and password");
		System.out.println("0. DO NOT CONTINUE");
		System.out.println("Enter your Choice");
		l= keyboard.nextInt();
		
	}

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int choice;
		COSC2436_FA2018_BANKSERVICE_LEE ob = new COSC2436_FA2018_BANKSERVICE_LEE();
		SinglyLinkedList list = new SinglyLinkedList();
		BankAccount_Lee account= new BankAccount_Lee();
		BankCustomer_Lee custo=new BankCustomer_Lee();
		Random rand = new Random();
		BankCheckingAccount_Lee checkings =new BankCheckingAccount_Lee();
		BankSavingAccount_Lee savings =new BankSavingAccount_Lee();
		//insert node to data structure
		File file = new File("src/bankCustomer.csv");
		try {
		   Scanner scanner = new Scanner(file);
		   while (scanner. hasNextLine()) {
		       String line = scanner. nextLine();//read one line
		       String splitline[]= line.split(","); 	
			if (splitline.length==10){
			  if (Float.parseFloat(splitline[9])>1){
				  	custo.setId(splitline[0]); //id
		    		custo.setlname(splitline[1]); //last name
		    		custo.setfname(splitline[2]); //first name
		    		custo.setuname(splitline[3]); //user name
		    		custo.setPassword(splitline[4]); //password
		    		custo.setAddress(splitline[5]); //address
		    		checkings.setNumber(splitline[6]); //number
		    		checkings.setBalance(Float.parseFloat(splitline[7])); //balance
		    		checkings.setLimit(Float.parseFloat(splitline[8]));  //limit
					checkings.setFee(Float.parseFloat(splitline[9])); //service fee
			  		}	   
			  else if (Float.parseFloat(splitline[9])<1){
				  	custo.setId(splitline[0]); //id
		    		custo.setlname(splitline[1]); //last name
		    		custo.setfname(splitline[2]); //first name
		    		custo.setuname(splitline[3]); //user name
		    		custo.setPassword(splitline[4]); //password
		    		custo.setAddress(splitline[5]); //address
				  	savings.setNumber(splitline[6]); //number
		    		savings.setBalance(Float.parseFloat(splitline[7])); //balance
					savings.setLimit(Float.parseFloat(splitline[8]));  //limit
					savings.setInterest(Float.parseFloat(splitline[9])); //interest rate
			  		}	   
			  custo.listAccount.add(checkings);
			  custo.listAccount.add(savings);
			  list.insert(custo);
			}
				else if (splitline.length==14){
				  if (Float.parseFloat(splitline[9])>1){
					  custo.setId(splitline[0]); //id
			    		custo.setlname(splitline[1]); //last name
			    		custo.setfname(splitline[2]); //first name
			    		custo.setuname(splitline[3]); //user name
			    		custo.setPassword(splitline[4]); //password
			    		custo.setAddress(splitline[5]); //address
			    		checkings.setNumber(splitline[6]); //number
			    		checkings.setBalance(Float.parseFloat(splitline[7])); //balance
			    		checkings.setLimit(Float.parseFloat(splitline[8]));  //limit
						checkings.setFee(Float.parseFloat(splitline[9])); //service fee
						savings.setNumber(splitline[10]); //number
						savings.setBalance(Float.parseFloat(splitline[11])); //balance
						savings.setLimit(Float.parseFloat(splitline[12]));  //limit
						savings.setInterest(Float.parseFloat(splitline[13])); //interest rate	
				  		}	   
				  else if (Float.parseFloat(splitline[9])<1){
					  	custo.setId(splitline[0]); //id
			    		custo.setlname(splitline[1]); //last name
			    		custo.setfname(splitline[2]); //first name
			    		custo.setuname(splitline[3]); //user name
			    		custo.setPassword(splitline[4]); //password
			    		custo.setAddress(splitline[5]); //address
					  	savings.setNumber(splitline[6]); //number
			    		savings.setBalance(Float.parseFloat(splitline[7])); //balance
						savings.setLimit(Float.parseFloat(splitline[8]));  //limit
						savings.setInterest(Float.parseFloat(splitline[9])); //interest rate
						checkings.setNumber(splitline[10]); //number
						checkings.setBalance(Float.parseFloat(splitline[11])); //balance
						checkings.setLimit(Float.parseFloat(splitline[12]));  //limit
						checkings.setFee(Float.parseFloat(splitline[13])); //service fee
				  		}	  
				  custo.listAccount.add(checkings);
				  custo.listAccount.add(savings);
				  list.insert(custo);
				}
		   } //end while loop 
		   scanner.close();
		}//end try
			catch ( FileNotFoundException e) {
		   System.out. println("File not found");
		   System.exit(0);
		}
		
		do{
			System.out.println("COSC2436 FA 2018 BANK SERVICE APPLICATION");
			System.out.println("1. Bank Employee");
			System.out.println("2. Bank Cusomter");
			System.out.println("0. Exit");
			System.out.println("Enter your Choice");
			choice= keyboard.nextInt();
		if (choice==1){
			do{
			ob.taskem();
			switch(ob.e){
				case 1://open account new customer
					
						System.out.println("Enter new customer id (social security number)");
						custo.id=keyboard.next();
						int value = rand.nextInt(1000000) + 1000000;
						checkings.number= new Integer(value).toString();
						if(list.fetch(checkings.number)==null){
						System.out.println("Enter new customer last name and first name");
						custo.setlname(keyboard.next());
						custo.setfname(keyboard.next());
						System.out.println("Enter new customer address");
						custo.setAddress(keyboard.next());
						list.insert(custo);
						}
						else{
							value= rand.nextInt(1000000) + 1000000;
						}
					
				
					
					break;
				case 2://display one customer with all accounts
					System.out.println("Enter customer Id");
					custo.id=keyboard.next();
					custo=list.fetch(custo.id);
					if(custo==null){
						System.out.println("The customer cannot be found.");
					}
					else{
						System.out.println(custo.toString());
						checkings.statement();
						savings.statement();
					}
					break;
				case 3://read one account of one customer
					ob.login();
					if(ob.l==1){
					System.out.println("Enter customer Id");
					custo.id=keyboard.next();
					if (list.fetch(custo.id)==null){
						System.out.println("The customer cannot be found");
					}
					else{
						System.out.println("Enter customer account number");
						account.number=keyboard.next();
						if(list.fetch(account.number)==null){
							System.out.println("The account cannot be found");
						}
						else{
							account.statement();
						}
						
					}
						}
					break;
				case 4://open new account for current customer
					break;
				case 5://remove one account of current customer
					break;
				case 6://display all customer with their accounts
					list.showAll();
					break;
				case 7: //process monthly statement
					break;
				case 0:
					System.out.println("Thank You1");
					break;
				default: 
					break;
		
		}}while(ob.e!=0);}
		else if (choice == 2){
			do{
			ob.login();
			if (ob.l==1){
				System.out.println("Enter your Id");
				custo.id=keyboard.next();
				if (list.fetch(custo.id)==null){
					System.out.println("The customer cannot be found");
				}
				else{
					ob.taskcu();
					switch(ob.c){
						case 1:
							System.out.println(list.fetch(custo.id));
							System.out.println("List of accounts:");
							checkings.statement();
							savings.statement();
							break;
						case 2: 
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						case 0:
							System.out.println("Thank You2");
							break;
						default: 
							break;
					}
				}
				
			}
			
			else if (ob.l==2){
				System.out.println("Enter your username");
				custo.uname=keyboard.next();
				System.out.println("Enter your password");
				custo.password=keyboard.next();
				if (list.fetch(custo.uname)==null&&list.fetch(custo.password)==null){
					System.out.println("The customer cannot be found");
				}
				else{
					ob.taskcu();
					switch(ob.c){
						case 1:
							System.out.println(custo.toString());
							System.out.println("List of accounts:");
							System.out.println(checkings.toString());
							System.out.println(savings.toString());
							break;
						case 2: 
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						case 0:
							System.out.println("Thank You3");
							break;
						default: 
							break;
					}
				}
			}
			}while(ob.c!=0);
		}
		else if(choice==0){
		custo.writeToFile();
		keyboard.close();}
	
	} while (choice!=0); //end application
}//end class

}//end main
