package com.neeraj;

public class ExampleMain
{
    public static void main(String[] args)
    {
        int a = 100;
        int b = 0;
        int c;

        int x[] = {1, 2, 3, 4, 5};

        System.out.println("START");

        try
        {
            c = a / b;
            System.out.println("C" + c);
            System.out.println(x[5]);
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("accessing element out of array");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("It's the finally block");
        }

        System.out.println("EXIT");

    }
}
