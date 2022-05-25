package exam;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		{
			int userscore=0;
			int totalscore=0;
			System.out.println("========================================QUIZ======================================");
			System.out .println("1. Which of the following option leads to the portability and security of Java?");
			
			System.out .println(" 1.Bytecode is executed by JVM\n 2.The applet makes the Java code secure and portable\n 3.Use of exception handling\n 4.Dynamic binding between objects");
			System.out.println("Enter Your Answer for 1.:");
			int q1=sc.nextInt();
			if(q1==4)
			{
				userscore++;
			}totalscore++;
			
	System.out .println("2. Byte Size?");
			
			System.out .println(" 1.1 Byte\n 2.2 Byte\n 3.4 Byte\n 4.8 Byte");
			System.out.println("Enter Your Answer for 2.:");
			int q2=sc.nextInt();
			if(q2==1)
				{
					userscore++;
				}totalscore++;
				
	System.out .println("3. Short Size?");
			
			System.out .println(" 1.1 Byte\n 2.2 Byte\n 3.4 Byte\n 4.8 Byte");
			System.out.println("Enter Your Answer for 3.:");
			int q3=sc.nextInt();
			if(q3==2)
			{
				userscore++;
			}totalscore++;
			
	System.out .println("4. Int Size?");
			
			System.out .println(" 1.1 Byte\n 2.2 Byte\n 3.4 Byte\n 4.8 Byte");
			System.out.println("Enter Your Answer for 4.:");
			int q4=sc.nextInt();
			if(q4==3)
			{
				userscore++;
			}totalscore++;
			
	System.out .println("5. Float Size?");
			
			System.out .println(" 1.1 Byte\n 2.2 Byte\n 3.4 Byte\n 4.8 Byte");
			System.out.println("Enter Your Answer for 5.:");
			int q5=sc.nextInt();
			if(q5==3)
			{
				userscore++;
			}totalscore++;
			
	System.out .println("6. Double Size?");
			
			System.out .println(" 1.1 Byte\n 2.2 Byte\n 3.4 Byte\n 4.8 Byte");
			System.out.println("Enter Your Answer for 6.:");
			int q6=sc.nextInt();
			if(q6==4)
			{
				userscore++;
			}totalscore++;
			
	System.out .println("7. Long Size?");
			
			System.out .println(" 1.1 Byte\n 2.2 Byte\n 3.4 Byte\n 4.8 Byte");
			System.out.println("Enter Your Answer for 7.:");
			int q7=sc.nextInt();
			if(q7==4)
			{
				userscore++;
			}totalscore++;
			
	System.out .println("8. 1 Byte =   Bit?");
			
			System.out .println(" 1.1 Byte\n 2.2 Byte\n 3.4 Byte\n 4.8 Byte");
			System.out.println("Enter Your Answer for 8.:");
			int q8=sc.nextInt();
			if(q8==4)
			{
				userscore++;
			}totalscore++;
			
	System.out .println("9. Char Size?");
			
			System.out .println(" 1.1 Byte\n 2.2 Byte\n 3.4 Byte\n 4.8 Byte");
			System.out.println("Enter Your Answer for 9.:");
			int q9=sc.nextInt();
			if(q9==2)
			{
				userscore++;
			}totalscore++;
			
	System.out .println("10. Boolean Size?");
			
			System.out .println(" 1.1 Bit\n 2.2 Byte\n 3.4 Byte\n 4.8 Byte");
			System.out.println("Enter Your Answer for 10.:");
			int q10=sc.nextInt();
			if(q10==1)
			{
				userscore++;
			}totalscore++;
			System.out.println("User Score"+userscore++);
		 System.out.println("Total Score"+totalscore++);
		 if(totalscore>=7)
		 {
			 System.out.println("user is eligible for C++");
			 
		 }
		 else if (totalscore>7)
		 {
			System.out.println("user is eleigible for java");
	}
		 else if(totalscore<7)
		 {
			 System.out.println("please take the retest");
		 }

}
}
}
