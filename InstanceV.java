import java.io.*;
public class InstanceV
{
public String name;
private double salary;
public InstanceV(String empName)
{
name=empName;
}
public void setSalary(double empsal)
{
salary=empsal;
}
public void printEmp()
{
System.out.println("Name="+name);
System.out.println("Salary="+salary);
}
public static void main(String z[])
{
InstanceV ins=new InstanceV("CSE");
ins.setSalary(500000);
ins.printEmp();
}
}


