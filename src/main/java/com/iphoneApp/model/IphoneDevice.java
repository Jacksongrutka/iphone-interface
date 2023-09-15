package main.java.com.iphoneApp.model;

public abstract class IphoneDevice implements MusicPlayer,Phone,Browser {

    protected String name;

    public abstract void playMusic();
    public abstract void makePhoneCall();
    public abstract void browser();
    public void pauseTrack(){
        System.out.println("pausando musica em: " + name);
    }
    public void playTrack(){
            System.out.println("Tocando musica com: " + name);
    }
    public void stopTrack(){
        System.out.println("Parando musica em: " + name);
    }
    public void callNumber (){
        System.out.println("Ligando com: " + name);
    }
    public void receiveCall(){
        System.out.println("Recebendo ligaçao com: " + name);
    }
    public void endCall(){
        System.out.println("Encerrando ligaçao com: " + name);
    }
    public void navigate(){
        System.out.println("Navegando na internet com: " + name);
    }
    public void search(){
        System.out.println("pesquisando na internet com: " + name);
    }
    public void displayPage(){
        System.out.println("Mostrando pagina da web com: " + name);
    }
}