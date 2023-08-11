import java.util.*;
import java.io.*;


public class monopoly {
    int location;
    String colour_type;
    int r,r1,r2,r3,r4,rh;
    int price;

    public static void main(String[] args)
    {
    }


}

class Dice{
    int min = 1;
    int max = 6;
    int random_int1 = (int)Math.floor(Math.random()*(max-min+1)+min);
    int random_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);
    total_dice_value = random_int1 + random_int2;
}