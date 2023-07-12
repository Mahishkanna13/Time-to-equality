import java.util.Scanner;

public class TimeEquality
{
    public static int Equality(int [] Array)
    {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<Array.length;i++)
        {
            if(Array[i]>max)
            {
                max=Array[i];
            }
        }
        for(int i=0;i<Array.length;i++)
        {
            sum+=max-Array[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++)
        {
            Array[i]=scan.nextInt();
        }

        System.out.println("The sum is : "+Equality(Array));
    }
}
