package Celula;

public class Cel {
    String exp;
    Cel anterior;
    
    Cel(){

    }

    public Cel(String exp, Cel anterior) {
        this.exp  = exp;
        this.anterior = anterior;
    }

    public String getExpressao() {
        return this.exp;
    }

    void setExpressao(String exp) {
        this.exp = exp;
    }
    
    public Cel getAnterior() {
        return this.anterior;
    }

    void setAnterior(Cel anterior) {
        this.anterior = anterior;
    }


}