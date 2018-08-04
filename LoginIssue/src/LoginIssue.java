//login issue
import java.util.Scanner;
public class LoginIssue {

	public static void main(String[] args) {
		int counter = 0;//initiliazie the counter
		String userName,password;
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("Enter User Name: ");
			userName = scanner.nextLine();//input the username
			System.out.println("Enter Password: ");
			password = scanner.nextLine();//input the password
			
			if (userName.equals("mike")&&password.equals("jaan123"))//checking condition
			{
				System.out.println("Welcome!");//access granted
				break;
			}
			else{
				System.out.println("Invalid UserID/Password");//access denied
				counter++;
			}
		}while(counter<3);
		if(counter == 3)
			System.out.println("Contact Admin");//invalid password count exceeded
	}

	
}
