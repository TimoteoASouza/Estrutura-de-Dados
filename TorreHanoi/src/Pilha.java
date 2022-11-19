import java.util.Stack;

public class Pilha {

    Stack <Integer> pilhaInicio = new Stack<>(); 
    Stack <Integer> pilhaFinal = new Stack<>(); 
    Stack <Integer> pilhaSup = new Stack<>(); 

    Long jogadas = (long) 0;

    void TorreHanoi(int nDiscos, Stack<Integer> Inicio, Stack <Integer> Final, Stack<Integer> Sup){
        
        if(nDiscos >= 0){
            TorreHanoi(nDiscos -1, Inicio, Sup, Final);
            Final.push(Inicio.pop());
            jogadas++;
            System.out.println("----------------------");
            System.out.println("Inicio: " + Inicio);
            System.out.println("Final: " + Final);
            System.out.println("Suporte: " + Sup);
            TorreHanoi(nDiscos -1, Sup, Final, Inicio);
        }
    }


}