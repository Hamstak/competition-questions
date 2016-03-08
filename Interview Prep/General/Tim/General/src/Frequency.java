import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Tim on 3/8/16.
 * Takes a file with a single line of comma separated ints.
 * prints the frequency of the most frequent int
 * O(n)
 */
public class Frequency {
    public static void main(String ... args) throws FileNotFoundException{
        if(args.length !=1){
            System.out.println("Usage: Java Frequency <File>");

        }
        Scanner fin = new Scanner(new File(args[0]));
        String[] prep = fin.nextLine().split(",");
        int[] array = new int[prep.length];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            int prepped = Integer.parseInt(prep[i].trim());
            array[i]= prepped;
            if(max < prepped)
                max = prepped;
        }
        int[] frequency = new int[max + 1];

        max = 0;

        for(int i = 0; i < array.length; i++){
            frequency[array[i]]++;
        }

        for(int i = 0; i < frequency.length; i++){
            if (frequency[max] < frequency[i])
                max = i;
        }

        System.out.println(max + " " +frequency[max]);

    }
}
