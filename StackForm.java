
/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program uses the class Stack, and can either push or pop values
 *
 ****************************************************************************/

import java.util.Scanner;

class StackForm
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        Scanner userInput = new Scanner(System.in);
        String userChoice;

        while (true)
        {
            System.out.print("What would you like to do? (push or pop) : ");
            userChoice = userInput.nextLine();

            // Pops the last value of stack
            if (userChoice.equals("pop"))
            {
                System.out.println(stack.pop());
            }
            // Pushes a value inputted by user, and will return an error message if it is
            // not a number
            else if (userChoice.equals("push"))
            {
                String pushValue;
                System.out.print("Enter an input to push : ");
                pushValue = userInput.nextLine();
                stack.push(pushValue);
            }
            // Prints out entire stack
            System.out.println("The values in the stack are : " + "\n" + stack.toString());
        }
    }
}
