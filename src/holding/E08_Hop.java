package holding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Gerbil1{
    private int gerbilNumber;

    public Gerbil1(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    void hop(){
        System.out.println("Gerbil " + gerbilNumber + " is hopping!");
    }
}

public class E08_Hop {
    public static void main(String[] args){
        List<Gerbil> list = new ArrayList<Gerbil>();
        for (int i = 0;i < 10;i++){
            list.add(new Gerbil(i));
        }
        Iterator<Gerbil> it = list.iterator();
        while(it.hasNext()){
            it.next().hop();
        }
    }
}
