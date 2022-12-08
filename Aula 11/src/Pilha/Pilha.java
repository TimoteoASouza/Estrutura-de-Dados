package Pilha;
import javax.swing.JOptionPane;
import Celula.Cel;
import Celula.AuxCel;

public class Pilha {
    Cel topo = null;

    AuxPilha pilhaAux = new AuxPilha();

    void push(String exp) {
        Cel nova = new Cel(exp, topo);
        this.topo = nova;
    }

    int sizePilha() {
        Cel p;
        int cont = 0;
        p = topo;
        while (p != null) {
            p = p.getAnterior();
            cont++;
        }
        return cont;
    }

    public boolean vefExpressao() {
        String exp = JOptionPane.showInputDialog(null, "Digite alguma Expressao!");
        boolean x = false;

        if(exp == "") {
            System.out.println("Digite alguma coisa na exp!");
            return false;
        }

        for (int i = 0; i < exp.length(); i++) {
            String expr = "";
            expr += exp.charAt(i);

            if (expr.equals("{") || expr.equals("[") || expr.equals("(")) {
                push(expr);
            }
        }
        for (int i = exp.length() - 1; i >= 0; i--) {
            String expr = "";
            expr += exp.charAt(i);

            if (expr.equals("}") || expr.equals("]") || expr.equals(")")) {
                pilhaAux.push(expr);
            }
        }

        Cel p = topo;
        AuxCel p2 = pilhaAux.topo;

        while ((p.getAnterior() != null) && (p2.getAnterior() != null)) {

            if (sizePilha() == pilhaAux.sizePilha()) {

                if (p.getExpressao().equals("{")) {

                    if (p2.getExpressao().equals("}")) {
                        x = true;
                    } else {
                        x = false;
                    }
                    p = p.getAnterior();
                    p2 = p2.getAnterior();
                }

                if (p.getExpressao().equals("[")) {
                    if (p2.getExpressao().equals("]")) {
                        x = true;
                    } else {
                        x = false;
                    }
                    p = p.getAnterior();
                    p2 = p2.getAnterior();
                }

                if (p.getExpressao().equals("(")) {
                    if (p2.getExpressao().equals(")")) {
                        x = true;
                    } else {
                        x = false;
                    }
                    p = p.getAnterior();
                    p2 = p2.getAnterior();
                }
            } else {
                break;
            }
        }
        return x;
    }

}