public class App {
    public static void main(String[] args) {
        List lista = new List();
        lista.sortear();

        for (int i = 0; i < lista.array.length; i++) {
            lista.ordemCres(lista.array[i]);
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        lista.imprimir();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        
        lista.numeroPrimo();
        
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        lista.imprimir();
    }
}
