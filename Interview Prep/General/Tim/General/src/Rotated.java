/**
 * Created by Tim on 3/8/16.
 */
public class Rotated {
    public static void main(String[] args) {
        int[] arrayNotRotated = {1,2,3,4,5,6,7,8};
        int[] rotatedArray = {4,5,6,7,8,1,2,3};

        if(arrayNotRotated.length != rotatedArray.length){
            System.out.println("Not rotated");
            System.exit(1);
        }

        int rotatedStart = 0;
        while(rotatedStart < rotatedArray.length){
            if(arrayNotRotated[0] == rotatedArray[rotatedStart])
                break;
            rotatedStart++;
        }
        if( rotatedStart == rotatedArray.length){
            System.out.println("Not rotated");
            System.exit(1);
        }

        for(int i = 0; i < arrayNotRotated.length; i++){
            if(arrayNotRotated[i] != rotatedArray[rotatedStart]){
                System.out.println("Not rotated");
                System.exit(1);
            }
            rotatedStart = rotatedStart + 1 == rotatedArray.length ? 0 : rotatedStart + 1;
        }
        System.out.println("Rotated: start = " + rotatedStart);
    }
}
