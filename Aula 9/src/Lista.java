import java.util.Random;

public class Lista {
    Celula Primeiro, Ultimo, Removido = new Celula(null);
    int Tamanho;

    void addInicio(Object Elemento) {
        Celula Nova = new Celula(Primeiro, Elemento);
            this.Primeiro = Nova;

        if (this.Tamanho == 0) {
            Ultimo = Primeiro;
        }
        this.Tamanho++;
    }

    void addFinal(Object Elemento) {
        if (this.Tamanho == 0) {
            addInicio(Elemento);
        } else {
            Celula Nova = new Celula(Elemento);
                this.Ultimo.setProximo(Nova);
                    this.Ultimo = Nova;
                        this.Tamanho++;
        }
    }

    boolean posicaoOcupada(int pos) {
        if ((pos >= 0) && (pos < this.Tamanho)) {
            return true;
        } else {
            return false;
        }
    }

    Celula pegarCelula(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posiçao nao existe!");
        } else {
            Celula atual = this.Primeiro;
            for (int i = 0; i < pos; i++) {
                atual = atual.getProximo();
            }
            return (atual);

        }
    }

    void addMeio(int pos, Object Elemento) {
        if (pos == 0) {
            this.addInicio(Elemento);
        } else {
            if (pos == this.Tamanho) {
                this.addFinal(Elemento);
            } else {
                Celula anterior = this.pegarCelula(pos - 1);
                Celula Nova = new Celula(anterior.getProximo(), Elemento);
                anterior.setProximo(Nova);
                    this.Tamanho++;
            }
        }
    }

    Object pega(int pos) { // Pega o Elemento na posição desajada
        return (this.pegarCelula(pos).getElement());
    }

    void removerInicio() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe!");
        } else {
            this.Primeiro = this.Primeiro.getProximo();
            // this.Tamanho;
            if (this.Tamanho == 0) {
                    this.Ultimo = null;
            }
        }
    }

    void remover(int pos) {

        if (posicaoOcupada(pos)) {
            if (pos == 0) {
                Removido = this.pegarCelula(pos);
                imprimirRemovido();
                removerInicio();
            }
            if ((pos > 0) && (pos < this.Tamanho)) {
                Removido = this.pegarCelula(pos);
                imprimirRemovido();

                if (pos == Tamanho - 1) {
                    Celula anterior = this.pegarCelula(pos - 1);
                    Ultimo = anterior;
                }else {
                    Celula proximo = this.pegarCelula(pos + 1);
                    Celula anterior = this.pegarCelula(pos - 1);
                    anterior.setProximo(proximo);
                }

            }

            this.Tamanho--;

        } else {
            throw new IllegalArgumentException("Nao eh possivel remover, pois a posicao nao existe!");
        }
    }

    Boolean contem(Object Elemento) {
        Celula atual = this.Primeiro;

        while (atual != null) {
            if (atual.getElement().equals(Elemento)) {
                return true;
            }

            atual = atual.getProximo();
        }
        return false;
    }

    int Tamanho() {
        return this.Tamanho;
    }

    Random random = new Random();
    int sorteado = 0;

    int x = 20;

    void sortear() {
        for (int i = 0; i <= 19; i++) {
            System.out.println(" \nrodada " + (i + 1) + "\n");

            if(x == 0){
                sorteado = 0;
            }else {
                sorteado = random.nextInt(x);
            }
            this.remover(sorteado);

            x--;

            for (int j = 0; j < x; j++) {
                Pessoa atual = (Pessoa) pega(j);

                System.out.println("O nome eh:" + atual.Nome);
                System.out.println("O telefone eh: " + atual.Telefone);
                System.out.println("O endereco eh: " + atual.Endereco);
                System.out.println("O CPF eh: " + atual.CPF + "\n\n");

            }

        }
    }

    void imprimirRemovido() {
        Pessoa removid = (Pessoa) Removido.getElement();

        System.out.println("A pessoa removida eh: " + removid.Nome);
        System.out.println("O numero eh: " + removid.Telefone);
        System.out.println("O endereco eh: " + removid.Endereco);
        System.out.println("O CPF eh: " + removid.CPF + "\n\n\n");
    }

}