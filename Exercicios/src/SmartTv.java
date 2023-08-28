public class SmartTv {
    //EXEMPLO DE POO PROJETO SMARTTV

    //ATRIBUTOS
    boolean ligada = false;
    int canal = 7;
    int volume = 25;
    
    //METODOS
    public void ligar (){
        ligada = true;
    }

    public void desligar(){
        ligada = false;

    }

    public void aumentarVolume(){
        volume++; 
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}
