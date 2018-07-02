class Instrument{
    void play(){System.out.println("playing instrument~");}
    static void tune(Instrument i){
        i.play();
    }
}

class Brass extends Instrument{
    void play(){
        System.out.println("playing brass~");
    }
}

public class Wind extends Instrument{
    void play(){
        System.out.println("playing Wind~");
    }
    public static void main(String[] args){
        Wind flute = new Wind();
        Brass brass = new Brass();
        Instrument.tune(flute); //向上转型
        Instrument.tune(brass);
    }
}