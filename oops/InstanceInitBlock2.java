class InstanceInitBlock1
{  
	InstanceInitBlock1()
	{  
		System.out.println("parent class constructor invoked");  
	}  
}  
class InstanceInitBlock2 extends InstanceInitBlock1
{  
	InstanceInitBlock2()
	{  
		super();  
		System.out.println("child class constructor invoked");  
	}  

	{
		System.out.println("instance initializer block is invoked");
	}  

	public static void main(String args[])
	{  
		InstanceInitBlock2 b=new InstanceInitBlock2();  
	}  
} 
