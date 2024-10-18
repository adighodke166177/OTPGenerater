import java.util.*;
class otpgenerater
{
	public static void main(String[] args)
	{
		int op= generateotp();
		System.out.println(op);
		
		
	}
	public static int generateotp()
	{
		return (int)(Math.random()*9999); 
	}
}