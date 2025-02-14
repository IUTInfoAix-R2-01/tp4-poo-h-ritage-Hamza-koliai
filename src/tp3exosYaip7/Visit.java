package tp3exosYaip7;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense,productExpense;
	
	public Visit(String name ,Date date) 
	{
		this.date = date;
		customer.setName(name);	
	}
	
	public String getName() 
	{
		return customer.getName()	;
	}

	public double getProductExpense() 
	{
		return productExpense;
	}

	public void setProductExpense(double productExpense) 
	{
		this.productExpense = productExpense;
	}

	public double getServiceExpense() 
	{
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) 
	{
		this.serviceExpense = serviceExpense;
	}
	public double getTotalExpense() 
	{
		return serviceExpense +productExpense;
	}
	
	public String toString() 
	{
		return "Customer :"+customer.toString()+" Expense: "+ getTotalExpense() +"$";
	}
	
	public static void main(String[] args) 
	{
		Customer c = new Customer("null");
		System.out.println(c.getName());
		c.setMember(true);
		c.setMemberType("TropBeau");
		System.out.println(c.toString());
		
		Date date =new Date();
		Visit v = new Visit("Coucou",date);
		v.setProductExpense(90);
		System.out.println(v.getProductExpense());
	}
}