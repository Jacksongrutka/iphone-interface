package main.java.com.iphoneApp.model;

public class Iphone extends IphoneDevice{

    public Iphone(String name){
        this.name = name;
    }
    @Override
    public void playMusic() {
        playTrack();
        pauseTrack();
        stopTrack();
    }


    @Override
    public void makePhoneCall() {
        callNumber();
        receiveCall();
        endCall();
    }


    @Override
    public void browser() {
        navigate();
        search();
        displayPage();
    }

    public static void main(String[] args) {
        Iphone iphone8 = new Iphone("iphone8");

        iphone8.pauseTrack();
    }


    
    
}
