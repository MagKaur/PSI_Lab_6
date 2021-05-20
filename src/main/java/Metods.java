public class Metods {


    public int minimum (int x, int y){

        int min = 0;

        if (x>y){
            min = y;
        }else{
            min = x;
        }

        return min;
    }


    public int maximum (int x, int y){

        int max = 0;

        if (x>y){

            max = x;
        }else{
            max = y;
        }

        return max;
    }

    public Boolean isPositive (int x){

        Boolean result = false;

        if (x>0){

            result = true;
        }
        else if(x == 0)
        {
            result = null;
        }

        return result;
    }
}
