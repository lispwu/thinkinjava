package enumerated.cartoons;

import net.mindview.util.Generator;

import java.util.Random;

enum CartoonCharacter implements Generator<CartoonCharacter>{
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private Random rand = new Random(47);
    public CartoonCharacter next(){
        return values()[rand.nextInt(values().length)];
    }
}

public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg){
        System.out.println(rg.next() + ", ");
    }
    public static void main(String[] args){
        CartoonCharacter cc = CartoonCharacter.BOB;
        Class clazz = CartoonCharacter.class;
        System.out.println("------" + clazz.getSuperclass());
        for(int i = 0;i < 7;i++)
            printNext(cc);
    }
}
