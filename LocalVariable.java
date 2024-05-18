import java.io.*;
public class LocalVariable
{
public void myAge()
{
int age=0;
age=age+17;
System.out.println("My New Age is :"+age);
}
public static void main(String z[])
{
LocalVariable lv=new LocalVariable();
lv.myAge();
}
}