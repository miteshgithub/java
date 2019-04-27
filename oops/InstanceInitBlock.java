class InstanceInitBlock
{  
	int speed;  

	InstanceInitBlock()
	{
		System.out.println("speed is "+speed);

	}  
	{
                System.out.println("Initializer block is created:");
		speed=100;
	}  


	public static void main(String args[])
	{  
		InstanceInitBlock b1=new InstanceInitBlock();  
		InstanceInitBlock b2=new InstanceInitBlock();  
	}      
}
/*In the above example, it seems that instance initializer block is firstly invoked but NO. Instance intializer block is invoked at the time of object creation. The java compiler copies the instance initializer block in the constructor after the first statement super(). So firstly, constructor is invoked.   */ 
