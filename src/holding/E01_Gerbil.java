package holding;

import java.util.ArrayList;
import java.util.List;

class Gerbil{
    private int gerbilNumber;

    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    void hop(){
        System.out.println("Gerbil " + gerbilNumber + " is hopping!");
    }
}

public class E01_Gerbil {
    public static void main(String[] args){
        List<Gerbil> list = new ArrayList<Gerbil>();
        for (int i = 0;i < 10;i++){
            list.add(new Gerbil(i));
        }
        for(int i = 0;i < 10;i++){
            list.get(i).hop();
        }
    }
}
