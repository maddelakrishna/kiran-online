package classessandobjects;

public class EmpDemo {

	public static void main(String[] args) {

             Employee emp = new Employee(); // default constructor
            //emp.setEid(1010);
             
             
             System.out.println(emp.getEid()+" "+emp.getName()+" "+emp.getSalary());
		

             
             
             
             
             
             Employee emp1 = new Employee(1,"James",2000.00);
             System.out.println(emp1.getEid()+" "+emp1.getName()+" "+emp1.getSalary());
	
	
	   Employee emp2 = new Employee(1010);
	   
	   System.out.println(emp2.getEid()+" "+emp2.getName()+" "+emp2.getSalary());
	   
	   
	   
	   
	   Employee emp3 = new Employee(30303, "arnold");
	   System.out.println(emp3.getEid()+" "+emp3.getName()+" "+emp3.getSalary());
	
	}

}
