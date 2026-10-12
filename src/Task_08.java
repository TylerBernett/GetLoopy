import java.util.Random;

public class Task_08
{
    static void main()
    {
        Random rnd = new Random();

            int die1, die2, die3, tries;

            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            tries = 0;



                System.out.printf("%3s%6s%8s%8s%8s\n", "Tries", "Die1", "Die2", "Die3", "Sum");

                while (die1 != die2 || die2 != die3)
                {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    die3 = rnd.nextInt(6) + 1;
                    tries++;

                    int sum = die1 + die2 + die3;

                    System.out.printf("%3d\t%6d\t%6d\t%6d\t%7d\n", tries, die1, die2, die3, sum);
                }
    }
}

