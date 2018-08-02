//Armstrong number
class armstrong
{
	public static void main(String []args)
	{
		int c=0,no=153,rem,temp;
		temp=no;
		while(no!=0)//calculate armstrong number 
		{
		rem=no%10;
		no=no/10;
		c=c+(rem*rem*rem);
		}
		if(temp==c)
		{
			System.out.println("number is armstrong");
			
		}
		else
		{
			System.out.println("number is not armstrong");
		}
	}
}