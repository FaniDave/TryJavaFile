package Lesson3;

//Company class
public class Company {

    //Instance fields
    private String address;
    private Employeee president;
    private int numEmployeees;

    //Constructor
    public Company(String address, Employeee president, int numEmployees) {
        this.address = address;
        this.president = president;
        this.numEmployeees = numEmployees;
    }

    //getters and setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employeee getPresident() {
        return new Employeee(president.getName(), president.getSalary());
    }

    public void setEmployeee(Employeee president) {
        this.president = president;
    }

    public int getNumEmployeees() {
        return numEmployeees;
    }

    public void setNumEmployeees(int numEmployeees) {
        this.numEmployeees = numEmployeees;
    }

    //main method
    public static void main(String[] args) {
        Employeee president = new Employeee("Faniel", 10000);
        Company company1 = new Company("1517 South Pagosa St, Aurora, 80017", president, 1);
        System.out.println(company1.getPresident().getSalary());
    }
}

//Employee Class
class Employeee {

    //Instance fields
    private String name;
    private int salary;

    //Constructor
    public Employeee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
