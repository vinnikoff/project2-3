/**
 * Created by VINNI on 08.11.16.
 */
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int[] balans={1200, 250, 2000, 500, 3200};
        String[] ownerNames={"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName="Ann";
        double withdrawal=100;
        int percent=5;

        System.out.println("OUTPUT");
        pay(balans, withdrawal, percent, ownerNames, ownerName);
    }

    public static void pay(int[] balans, double withdrawal, int percent, String[] ownerNames, String ownerName)
    {
        int k=0;
        for (int i=ownerNames.length-1; i>0; i--)
        {
            if (ownerNames[i]==ownerName)
                k=i;
        }

        int paypercent=(int)withdrawal*percent/100;
        int payall=(int)withdrawal+paypercent;
        int newbalans = balans[k]-payall;

        if (newbalans<0)
            System.out.println(ownerNames[k] + " " + "NO");

        else
            System.out.println(ownerNames[k] +" " + (int)withdrawal + " " + newbalans);
    }
}
