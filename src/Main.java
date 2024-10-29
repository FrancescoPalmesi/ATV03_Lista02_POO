public class Main {
    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado("Thales", "Silva", "139012466", 3000.00);
        Comissionado comissionado = new Comissionado("Francesco", "Palmesi", "139012466",1000.00, 0.1);
        Horista horista = new Horista("Mauricio", "Costa", "139012466", 30.00, 140);

        System.out.println("Vencimento do Assalariado: " + assalariado.vencimento());
        System.out.println("Vencimento do Comissionado: " + comissionado.vencimento());
        System.out.println("Vencimento do Horista: " + horista.vencimento());
    }
}
