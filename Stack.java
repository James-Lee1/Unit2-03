/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program creates a stack and cna push or pop without errors
 *
 ****************************************************************************/

import java.util.ArrayList;

class Stack
{
    private final ArrayList<Integer> myStack = new ArrayList<Integer>();

    // Pushes a string that if it is not a number, returns an error
    public void push(int number)
    {
        myStack.add(number);
    }

   // Removes top value of stack
    public int pop()
    {
        if (myStack.size() == 0)
        {
            return -1;
        }
        else
        {
            return myStack.remove(myStack.size()-1);
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
}
