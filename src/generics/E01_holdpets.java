package generics;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

public class E01_holdpets {
    public static void main(String[] args){
        Pet cat = new Cat();
        Holder3<Pet> hold = new Holder3<>(cat);
        System.out.println(hold.getA());
    }
}
