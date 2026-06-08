package exercicio.classe.anonima;

interface Alarme {
    void disparar();
}

public class InterfaceAlarmeDemo {
    public static void main(String[] args) {
        Alarme meuAlarme = new Alarme() {
            @Override
            public void disparar() {
                System.out.println("Bom dia Campeão!");
            }
        };

        meuAlarme.disparar();
    }
}