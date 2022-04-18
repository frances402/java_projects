import java. io.*;
import java.util.*;
public class BankCustomer_Lee {
	protected String id;
	protected String lname;
	protected String fname;
	protected String uname;
	protected String password;
	protected String address;
	LinkedList<BankAccount_Lee> listAccount;
	
	public BankCustomer_Lee() {
		this.id="";
		this.lname="";
		this.fname="";
		this.uname="";
		this.password="";
		this.address="";
		this.listAccount= new LinkedList();
	}
	public BankCustomer_Lee(String id, String lname, String fname, String uname, String password, String address){
		this.id=id;
		this.lname=lname;
		this.fname=fname;
		this.uname=uname;
		this.password=password;
		this.address=address;
	}
	
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getlname() {
        return lname;
    }

    public void setlname(String lname) {
        this.lname = lname;
    }
    
    public String getfname(){
    	return fname;
    }
    
    public void setfname(String fname) {
        this.fname = fname;
    }
    
    public String getuname(){
    	return uname;
    }
    
    public void setuname(String uname) {
        this.uname = uname;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address= address;
    }

		 
	public int compareTo(String targetKey){
		return(id.compareTo(targetKey));
	}

	public	BankCustomer_Lee deepCopy(){
		BankCustomer_Lee clone=new BankCustomer_Lee(id,lname,fname,uname,password,address);
		return clone;
	}
	
	public String write(){
		return id+","+lname+","+fname+","+uname+","+password+","+address;
	}
	
	public void writeToFile(){
		try
		{
		String filename= "src/bankCustomer.csv";
		FileWriter fwriter = new FileWriter(filename,true); //add true will append the new data
		fwriter.write(this.write());//write the string to the file
		fwriter.close();
		}
		catch( IOException ioe)
		{
		System.err. println(" IOException: " + ioe. getMessage());
		}
	}
	
	public String toString(){
		String output;
		output="Customer Name:\t"+lname+", "+fname+"\nCustomer id:\t"+ id+"\nAddress:\t"+ address;
		for(BankAccount_Lee account: listAccount)
			if(account!=null){
			output+=account.toString();}
		return output;
		
		
	}
}