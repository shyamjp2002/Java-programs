//Sum of digits of a number

public static void main(String args[])  
{  
int number, digit, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
number = sc.nextInt();  
while(number > 0)  
{  
//finds the last digit of the given number    
digit = number % 10;  
//adds last digit to the variable sum  
sum = sum + digit;  
//removes the last digit from the number  
number = number / 10;  
}  
//prints the result  
System.out.println("Sum of Digits: "+sum);  
}  

-----------------------------------------------------------------------------------------

//Print prime number from 1 to 100

public class PrintPrime {
    public static void main (String[] args)
    {
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        for (i = 1; i <= 100; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}
