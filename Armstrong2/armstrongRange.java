import java.util.Scanner;

class armstrong{
	public static void main(String []args)
	{
		for(int k=100;k<=999;k++)//setting range from 100-999
		{
			int no=k;//initializing no
			int d=0;
			int s=0;
			while(no>0)
			{
				d=no%10;
				s=s+(d*d*d);
				no=no/10;
			}
			if(k==s)
			{
				System.out.println(k+" is Armstrong Number");
			}
		}
	}
}