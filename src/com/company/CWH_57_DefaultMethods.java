package com.company;

interface Camera{
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
interface Call{
    String[] speedDial();
    String voiceCalling(String dial);
}
class Gaming{
    void playGame(int gameNum){
        System.out.println("Playing android games" + gameNum);
    };
    void installGame(){
        System.out.println("installing mega games");
    };
}

class MyPhone extends Gaming implements Camera,Call{

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


public class CWH_57_DefaultMethods {
    public static void main(String[] args) {
        MyPhone mp=new MyPhone();
        String[] ar=mp.speedDial();
        for(String item:ar){
            System.out.println(item);
        }
        mp.takeSnap();
        mp.speedDial();
        mp.shooting4k();

    }
}
