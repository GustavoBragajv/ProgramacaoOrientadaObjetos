package poocaneta;

public class CanetaTeste {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("Bic", "Azul", 0.5, 50);
        Caneta caneta2 = new Caneta("HostNet", "Vermelha", 0.3, 65);
        caneta1.statusCaneta();
        caneta1.tamparCaneta();
        caneta1.destamparCaneta();
        caneta1.rabiscar();
        caneta1.tamparCaneta();
        caneta1.rabiscar();
        System.out.println("=================================================");
        caneta2.statusCaneta();
        caneta2.tamparCaneta();
        caneta2.destamparCaneta();
        caneta2.destamparCaneta();
        caneta2.rabiscar();


    }
}
