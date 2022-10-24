package wrestlingSimulation;
import java.lang.Math;

public class chance {

    //25%
    int[] chance1 = {0, 1, 0, 0};
    //20%
    int[] chance2 = {0, 0, 1, 0, 0};
    //10%
    int[] chance3 = {0, 0, 0, 0, 1, 0, 0, 0, 0, 0};


    public boolean getChance(int x){
        if(x == 25){
            int temp = getRandom(chance1);
            if(temp == 1){
                return true;
            }
            return false;
        }
        else if(x == 20){
            int temp = getRandom(chance2);
            if(temp == 1){
                return true;
            }
            return false;
        }
        else if(x == 10){
            int temp = getRandom(chance3);
            if(temp == 1){
                return true;
            }
            return false;
        }
        return false;
    }


    public int getRandom(int[] x){
        int temp = (int)(Math.random() * x.length);
        int num = x[temp];
        return num;
    }


}
