import java.util.*;
class java
{
	public static void main(String args[])
	{
    		int no;
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter how many terms you want to add");
    		no=sc.nextInt();

    		System.out.println("Summation of first "+no+" natural numbers = "+sum(no));
	}

	static int sum(int n)
	{
    		if(n==0)
        		return n;
    		else 
        		return (n+sum(n-1));
	}
}
