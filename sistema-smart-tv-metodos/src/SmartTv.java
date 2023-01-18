public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void maiorCanal(){
        //canal = canal + 1;
        canal++;
    }

    public void menorCanal(){
       //canal = canal - 1;
        canal--;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
    
        volume++;
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
    }

    public void ligar (){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    
    }
    
    }

