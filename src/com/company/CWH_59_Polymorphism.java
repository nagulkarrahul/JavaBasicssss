package com.company;
interface Camera1{
    void takeSnap();
    void recordVideo();
    private void makeWish(){
        System.out.println("Make a wish foundation");
    }
    default void shooting4k(){
        makeWish();
        System.out.println("Shooting in 4k");
    }
}
interface Call1{
    String[] speedDial();
    String voiceCalling(String dial);
}
class Gaming1{
    void playGame(int gameNum){
        System.out.println("Playing android games" + gameNum);
    };
    void installGame(){
        System.out.println("installing mega games");
    };
}

class MyPhone1 extends Gaming1 implements Camera1,Call1{

    void messaging(){
        System.out.println("Read messages");
    }
    public void takeSnap(){
        System.out.println("Take HD snap");
    }
    public void recordVideo(){
        System.out.println("Record 4k video");
    }
    public String[] speedDial(){
        System.out.println("Speed dial on phone" );
        String[] dialList={"RN","SN","PN"};
        return dialList;
    };
    public String voiceCalling(String dial){
        System.out.println("Voice over calling");
        return dial ;
    };
    public void playGame(){
        System.out.println("PUBG on mobile");
    };
    public void installGame(){
        System.out.println("Installled PubG on phone");
    }

}



public class CWH_59_Polymorphism {
    public static void main(String[] args) {

        Camera1 obj = new MyPhone1();
        obj.shooting4k();
        obj.recordVideo();
        obj.takeSnap();
        System.out.print("\n");
        MyPhone1 obj1=new MyPhone1();
        obj1.speedDial();
        obj1.voiceCalling("RN");
        obj1.messaging();


    }
}

