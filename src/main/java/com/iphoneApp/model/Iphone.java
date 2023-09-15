package main.java.com.iphoneApp.model;

public class Iphone extends IphoneDevice{

    private String name;

    public Iphone(String name){
        this.name = name;
    }

    @Override
    public void playTrack(){
        System.out.println("Tocando musica com: " + name);
    }
    @Override
    public void pauseTrack(){
        System.out.println("pausando musica em: " + name);
    }
    @Override
    public void stopTrack(){
        System.out.println("Parando musica em: " + name);
    }
    @Override
    public void callNumber (){
        System.out.println("Ligando com: " + name);
    }
    @Override
    public void receiveCall(){
        System.out.println("Recebendo ligaçao com: " + name);
    }
    @Override
    public void endCall(){
        System.out.println("Encerrando ligaçao com: " + name);
    }
    @Override
    public void navigate(){
        System.out.println("Navegando na internet com: " + name);
    }
    @Override
    public void search(){
        System.out.println("pesquisando na internet com: " + name);
    }
    @Override
    public void displayPage(){
        System.out.println("Mostrando pagina da web com: " + name);
    }

    public static void main(String[] args) {
        Iphone iphone8 = new Iphone("iphone8");

        iphone8.callNumber();
    }
    
}
