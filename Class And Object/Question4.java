import java.lang.*;
class Employee{
    private int empid,salary;
    private String name;
    public void setempid(int id){
        empid=id;   
    }
    public void setsalary(int s){
        salary=s;
    }
    public void setname(String n){
        name=n;
    }
    public int getEmpid() {
        return empid;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
}
public class Question4 {
    public static void main(String[] args) {
         Employee e1 = new Employee();
         e1.setempid(1);
         e1.setname("Farjad Zamir");
         e1.setsalary(2000);
         System.out.println();
         System.out.println("EmployeeId:"+e1.getEmpid());
         System.out.println("Employeename:"+e1.getName());
         System.out.println("Employeesalary:"+e1.getSalary());   
    }
}
