package Pilha;
import Celula.AuxCel;

public class AuxPilha {
    AuxCel topo = null;

    void push(String exp) {
        AuxCel nova = new AuxCel(exp, topo);
        this.topo = nova;
    }



    int sizePilha() {
        AuxCel p;
        int cont = 0;
        p = topo;
        while(p!=null) {
            p = p.getAnterior();
            cont++;
        }
        return cont;
    }
}