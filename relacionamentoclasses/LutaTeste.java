package relacionamentoclasses;

public class LutaTeste {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[6];
        Luta uec01 = new Luta();


        lutadores[0] = new Lutador("Pretty Boy", "França", 31,
                11, 2, 1, 1.75, 68.9);


        lutadores[1] = new Lutador("Putscript", "Brasil", 29,
                14, 2, 3, 1.68, 57.8);


        lutadores[2] = new Lutador("Snapshadow", "Alemanha", 35,
                12, 2, 1, 1.65, 80.9);


        lutadores[3] = new Lutador("Dead Code", "Marrocos", 28,
                13, 0, 2, 1.93, 81.6);


        lutadores[4] = new Lutador("Ufocobol", "Australia", 37,
                5, 4, 3,1.70, 119.3);


        lutadores[5] = new Lutador("Nerdaard", "Argentina", 30,
                12, 2, 4, 1.81, 105.7);


        System.out.println("============= ULTRA EMOJI COMBAT =============");
        uec01.marcarLuta(lutadores[1], lutadores[4]);


        for(int i = 0; i <= 15; i++) {
            uec01.lutar();

        }

        System.out.println("============================");
        System.out.println();
        lutadores[0].statusLutador();
        System.out.println("============================");
        System.out.println();
        lutadores[1].statusLutador();
        if(lutadores[0].getVitorias() > lutadores[1].getVitorias()) {
            System.out.println("O maior campeão é o: " + lutadores[0].getNome());
        } else if(lutadores[1].getVitorias() > lutadores[0].getVitorias()) {
            System.out.println("O maior campeão é o: " + lutadores[1].getNome());
        }

    }
}
