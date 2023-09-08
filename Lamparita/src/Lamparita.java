public class Lamparita {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a programar una lamparita! ");
        Lamparita lamparita = new Lamparita();
        lamparita.switchLamparita();
        System.out.println("El estado de la lamparita es:" + lamparita.getEstadoLamparita());
        lamparita.switchLamparita();
        System.out.println("El estado de la lamparita es:" + lamparita.getEstadoLamparita());
    }

    private boolean estadoLamparita = false;

    public void switchLamparita(){
        estadoLamparita = !estadoLamparita;
    }

    public void apagarLamparita(){
        estadoLamparita = false;
    }
    
    public void prenderLamparita(){
        estadoLamparita = true;
    }
    public boolean getEstadoLamparita(){
        return estadoLamparita;
    }

}
