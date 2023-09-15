package main.java.com.iphoneApp.model;

public abstract class IphoneDevice implements MusicPlayer,Phone,Browser {

    public void playMusic(){
        playTrack();
        pauseTrack();
        stopTrack();
    };
    public void makePhoneCall(){
        callNumber();
        receiveCall();
        endCall();
    }
    public void browser(){
        navigate();
        search();
        displayPage();
    }
}