/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program creates a stack and pushes three numbers to it, and pops
 * the last value
 *
 ****************************************************************************/

import java.util.ArrayList;

class Stack
{
    private final ArrayList<Integer> myStack = new ArrayList<Integer>();
    private static String update = "";

    // Pushes a string that if it is not a number, returns an error
    public void push(String number)
    {
        if (isNumeric(number) == false)
        {
            System.out.print("Not a valid input" + "\n");
        }
        else
        {
            myStack.add(Integer.parseInt(number));
        }
    }

    public String pop()
    {
        //removes top value from stack
        int top = myStack.size()-1;

        // In the case the stack is empty
        if (top < 0)
        {
            update = "No value!" + "\n";
            return update;
        }
        else
        {
            update = myStack.remove(top) + " was removed." + "\n";
            return update;
        }
    }

    // Converts stack into string
    public String toString()
    {
        String output = "";

        for (Integer count : myStack)
        {
            output += count + "\n";
        }

        return output.toString();
    }

    public static boolean isNumeric(String str)
    {   // Checks if string is a valid number
        try
        {
            int i = Integer.parseInt(str);
            if (i >= 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        catch(NumberFormatException nfe)
        {
            return false;
        }
    }

}
