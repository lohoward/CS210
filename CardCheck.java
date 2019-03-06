//Checks if a credit card number is valid
//Louise Howard

import java.util.*;
public class CardCheck
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String num = new String("");
		num = sc.next();
		sc.close();

		if(check(num))
		{
			System.out.println("Number is valid!");
		}
		else
		{
			System.out.println("Number is NOT valid!");
		}
	}


    public static boolean check(String num)
    {

            int sum = 0;
            boolean alternate = false;
            for (int i = num.length() - 1; i >= 0; i--)
            {
                    int n = Integer.parseInt(num.substring(i, i + 1));
                    if (alternate)
                    {
                            n *= 2;
                            if (n > 9)
                            {
                                    n = (n % 10) + 1;
                            }
                    }
                    sum += n;
                    alternate = !alternate;
            }
            return (sum % 10 == 0);
    }
}
