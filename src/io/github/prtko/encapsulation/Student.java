package io.github.prtko.encapsulation;

public class Student 
{
    private String name;
    private int age;
    private String address;
    
    
    public Student(String name,int age,String address)
    {
    	this.name=name;
    	this.age=age;
    	this.address=address;
    	
    }
    
    public void setName(String name)
    {
    	this.name=name;
    }
    
    public void setAge(int age)
    {
    	this.age=age;
    }
    
    public void setAddress(String address)
    {
    	this.address=address;
    }
    
    public String getName()
    {
    	return name;
    }
    
    public int getAge()
    {
    	return age;
    }
    
    public String getAddress()
    {
    	return address;
    }
    
    
    public String toStrinng() 
    {
    	return("Student name is: "+this.getName()+", age is: "+this.getAge()+" and addresss is: "+this.getAddress());
    	
    }
    
    public static void main(String[] args)
    {
    	Student john=new Student("JOHN",26,"23 EAST CALIFORNIA");
    	
    	System.out.println(john.getName());
    	System.out.println(john.getAge());
    	System.out.println(john.getAddress());
    	
    }
    
}
