package Celula;

public class AuxCel {
    String exp;
    AuxCel anterior;
    
    AuxCel(){}

    public AuxCel(String exp, AuxCel anterior) {
        this.exp  = exp;
        this.anterior = anterior;
    }

    public String getExpressao() {
        return this.exp;
    }

    void setExpressao(String exp) {
        this.exp = exp;
    }
    
    public AuxCel getAnterior() {
        return this.anterior;
    }

    void setAnterior(AuxCel anterior) {
        this.anterior = anterior;
    }
}