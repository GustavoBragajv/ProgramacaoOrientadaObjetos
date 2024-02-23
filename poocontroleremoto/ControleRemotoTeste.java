package poocontroleremoto;

public class ControleRemotoTeste {
    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto();
        controle1.abrirMenu();
        controle1.ligarTelevisao();
        controle1.abrirMenu();
        System.out.println("===============================================");
        controle1.aumentarVolume();
        controle1.abrirMenu();
        System.out.println("===============================================");
        controle1.desligarMudo();
        controle1.abrirMenu();
        System.out.println("===============================================");
        controle1.desligarTelevisao();
        controle1.abrirMenu();
        System.out.println("===============================================");
        controle1.ligarTelevisao();
        controle1.abrirMenu();
        System.out.println("===============================================");
        controle1.aumentarVolume();
        controle1.abaixarVolume();
        controle1.play();
        controle1.ligarMudo();
        controle1.pause();
        controle1.desligarMudo();
        controle1.aumentarVolume();
        controle1.aumentarVolume();
        controle1.desligarTelevisao();
        controle1.abrirMenu();

    }
}
