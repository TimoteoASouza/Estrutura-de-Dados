import Pilha.Pilha;

public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();

        if(pilha.vefExpressao()) {
            System.out.println("Esta Expessao esta correta!");
        }else {
            System.out.println("Esta Expressao esta incorreta!");
        }
    }
}