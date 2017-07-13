import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String name;
        String answer;
        int userNum;
        int counter = 0;


        System.out.print("Hi! Enter your name: ");
        name = scan.nextLine();

        System.out.println("Hello "+ name + "!" + " " + "How are you?");
        System.out.println();


        do {
            System.out.print(name + ", enter a number between 1 and 100: ");

            userNum = scan.nextInt();
            scan.nextLine();

            if ((userNum < 1) || (userNum > 100)) {
                System.out.println("Sorry, please enter a number between 1 and 100.");
                System.out.println();
                counter++;

                if (counter == 3) {
                    System.out.println("Sorry, you entered an incorrect value too many times.");
                    break;
                }
            } else {
                evaluateNum(userNum);
            }

            System.out.print("Would you like to enter another value? Yes/No: ");
            answer = scan.nextLine();
            System.out.println();
        } while(answer.equals("Yes"));

    }

    public static void evaluateNum(int n)
    {
        int userNum = n;

        if ((userNum % 2 == 1) && (userNum < 60)) {
            System.out.println("Odd");
        } else if ((userNum % 2 == 0) && (userNum >= 2) && (userNum < 25)) {
            System.out.println("Even and less than 25");
        } else if ((userNum % 2 == 0) && (userNum >= 26) && (userNum <= 60)) {
            System.out.println("Even");
        } else if ((userNum % 2 == 0) && (userNum >= 60)) {
            System.out.println(userNum + ": " + "Even");
        }
        else if ((userNum % 2 == 1) && (userNum > 60)) {
            System.out.println(userNum + ": " + " Odd & over and 60");
        }
    }
} //END OF MAIN


