import java.util.Locale;
import java.text.NumberFormat;

class Employee {
	
    // instance variables:
    protected String name; 
    private int salary; 
    
    Employee(String name){ // Parameterized Constructor 
        this.name = name; 
    }
    
    String getName(){
        return name; 
    }
    
    void setSalary(int salary){
        this.salary = salary; 
    }

    int getSalary(){
        return salary; 
    }
     
    void print(){  /** Print information about an instance of Employee. **/
        if(this.salary == 0){
            System.err.println("Error: No salary set for " + this.name 
                + "; please set salary and try again.\n");
        }
        else{ // Print employee information
            // Formatter for salary that will add commas between zeroes:
            NumberFormat salaryFormat = NumberFormat.getNumberInstance(Locale.US);
            
            System.out.println("Employee Name: " + this.name 
                + "\nSalary: " + salaryFormat.format(this.salary) + "\n");
        }
    }
}

class Volunteer extends Employee{
	// instance variable:
    int hours;

    Volunteer(String name){ // Parameterized Constructor 
    	// explicit call to superclass' parameterized constructor
        super(name);  
    }
    
    void setHours(int hours){
        this.hours = hours; 
    }
    
    int getHours(){
        return hours; 
    }
    
    @Override 
    void print(){ /** Overrides the superclass' print method and prints information about an instance of Volunteer. **/
        System.out.println("Volunteer Name: " + this.getName() 
            + "\nHours: " + this.getHours());    
    }
}


/* The following code:
Employee employee = new Employee("Erica");
employee.print();
employee.setSalary(60000);
employee.print();
        
Volunteer volunteer = new Volunteer("Anna");
volunteer.setHours(20);
volunteer.print();


produces this output:

Error: No salary set for Erica; please set salary and try again.

Employee Name: Erica
Salary: 60,000

Volunteer Name: Anna
Hours: 20
*/