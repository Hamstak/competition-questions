import javafx.util.Pair;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Tim on 3/8/16.
 * takes a file as a line argument, formatted as white space delimited ints
 * Finds pairs of ints in the file which add to 10
 * O(n)
 */
public class SumPairs {

    public static void main(String[] args) throws FileNotFoundException{
        if(args.length != 1){
            System.out.println("Usage: Java SumPairs <File>");
            System.exit(-1);
        }

        Scanner fin = new Scanner(new File(args[0]));
        HashMap<Integer, Pair<Boolean, Pair<Integer, Integer>>> map = new HashMap<>();
        while(fin.hasNext()){
            int temp = fin.nextInt();
            if(map.get(10 - temp) != null){
                map.replace(10-temp, new Pair<>(true, new Pair<Integer, Integer>(10 - temp, temp)));
                System.out.println(map.get(10-temp).getValue());
            }else{
                map.put(temp, new Pair<>(false, new Pair(false, new Pair<>(0, 0))));
            }
        }
    }
}
