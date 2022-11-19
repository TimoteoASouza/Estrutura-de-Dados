public class Cel {
    Cel proxima, anterior;
    Object elemento;

    Cel(Cel prox, Object elemento) {
        this.proxima = prox;
        this.anterior = null;
        this.elemento = elemento;
    }

    Cel(Object elemento) {
        this.proxima = null;
        this.anterior = null;
        this.elemento = elemento;
    }

    void setProxima(Cel prox) {
        this.proxima = prox;
    }

    void setAnterior(Cel ant) {
        this.anterior = ant;
    }

    Cel getProxima() {
        return this.proxima;
    }

    Cel getAnterior() {
        return this.anterior;
    }

    int getElementInt() {
        return (int) this.elemento;
    }
    Object getElement(){
        return this.elemento;
    }
    
}

