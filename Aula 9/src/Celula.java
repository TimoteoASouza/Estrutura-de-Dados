public class Celula {
    Celula Proximo;
    Object Elemento;
    
    public Celula(Object Elemento){
        this.Elemento = Elemento;
    }
    public Celula(Celula Proximo, Object Elemento){
        this.Proximo = Proximo;
        this.Elemento = Elemento;
    }

    void setProximo(Celula Proximo){
        this.Proximo = Proximo;
    }

    Celula getProximo(){
        return this.Proximo;
    }

    Object getElement(){
        return this.Elemento;
    }

}

