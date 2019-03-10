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

            if (userChoice.equals("pop"))
            {
                System.out.println(stack.pop());
            }
            else if (userChoice.equals("push"))
            {
                String pushValue;
                System.out.print("Enter an input to push : ");
                pushValue = userInput.nextLine();
                stack.push(pushValue);
            }
            System.out.println("The values in the stack are : " + "\n" + stack.toString());
        }
    }
}
