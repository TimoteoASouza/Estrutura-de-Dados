import java.util.Random;

public class List {
    Cel primeira, ultima;
    int tamanho;

    boolean posicaoOcupada(int pos) {
        if ((pos >= 0) && (pos < this.tamanho)) {
            return true;
        } else {
            return false;
        }
    }

    Cel pegarCelula(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posiçao Inexistente!");
        } else {
            Cel atual = this.primeira;
            for (int i = 0; i < pos; i++) {
                atual = atual.getProxima();
            }
            return (atual);

        }
    }

    Object pega(int pos) {
        return this.pegarCelula(pos).getElement();
    }

    void addInicio(Object elemento) {

        if (this.tamanho == 0) {
            Cel nova = new Cel(primeira, elemento);
            primeira = nova;
            ultima = primeira;
        } else {
            Cel nova = new Cel(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.tamanho++;
    }

    void addFinal(Object elemento) {
        if (tamanho == 0) {
            this.addInicio(elemento);
        } else {
            Cel nova = new Cel(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(ultima);
            this.ultima = nova;
            tamanho++;
        }
    }

    void addMeio(int pos, Object elemento) {
        if (pos == 0) {
            addInicio(elemento);
        } else {
            if (pos == tamanho) {
                addFinal(elemento);
            } else {
                Cel anterior = this.pegarCelula(pos - 1);
                Cel proxima = anterior.getProxima();
                Cel nova = new Cel(anterior.getProxima(), elemento);

                nova.setAnterior(anterior);
                anterior.setProxima(nova);
                proxima.setAnterior(nova);
                tamanho++;
            }
        }
    }

    void removerInicio() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Essa posição eh inexistente!");
        } else {
            this.primeira = this.primeira.getProxima();
        }
        if (tamanho == 0) {
            this.ultima = null;
        }
    }

    void removerFim() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Essa posição eh inexistente!");
        } else {
            if (tamanho == 1) {
                removerInicio();
            } else {
                Cel anterior = this.ultima.getAnterior();
                anterior.setProxima(null);
                ultima = anterior;
                tamanho--;
            }
        }
    }

    void removerMeio(int pos) {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Essa posição eh inexistente!");
        } else {
            if (pos == 0) {
                removerInicio();
            } else {
                if (pos == tamanho - 1) {
                    removerFim();
                } else {
                    Cel anterior = this.pegarCelula(pos - 1);
                    Cel atual = anterior.getProxima();
                    Cel proxima = atual.getProxima();

                    anterior.setProxima(proxima);
                    proxima.setAnterior(anterior);
                    tamanho--;
                }
            }
        }
    }

    Boolean contem(Object elemento) {
        Cel atual = this.primeira;

        while (atual != null) {
            if (atual.getElement().equals(elemento)) {
                return true;
            }

            atual = atual.getProxima();
        }
        return false;
    }

    void clearLista() {
        this.primeira = null;
        this.ultima = null;
        tamanho = 0;
    }

    void imprimir() {
        if (this.tamanho == 0) {
            System.out.println("[]");
        } else {
            StringBuilder builder = new StringBuilder("[");
            Cel atual = this.primeira;

            for (int i = 0; i < this.tamanho - 1; i++) {
                builder.append(atual.getElement());
                builder.append(", ");
                atual = atual.getProxima();
            }

            builder.append(atual.getElement());
            builder.append("]");
            builder.toString();
            System.out.println(builder);
        }
    }

    Random random = new Random();
    int nSorteado = 0;
    int[] array = new int[1000];

    void sortear() {

        StringBuilder string = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {

            nSorteado = random.nextInt(19999);
            if (nSorteado > 9999) {
                nSorteado = (nSorteado - 9999) * (-1);
            }

            array[i] = nSorteado;
            string.append(array[i]);
            string.append(",");
        }

        string.append("]");
        string.toString();
        System.out.println(string);
    }

    void ordemCres(Object elemento) {
        Cel nova = new Cel(elemento);
        Cel anterior = this.ultima;
        int pos = tamanho;

        if (tamanho == 0) {
            addInicio(elemento);
        } else {
            if (nova.getElementInt() >= anterior.getElementInt()) {
                addFinal(elemento);
            } else {
                boolean verificarAdd = false;

                while (nova.getElementInt() <= anterior.getElementInt()) {
                    if (anterior.getAnterior() == null) {
                        addInicio(elemento);
                        verificarAdd = true;
                        break;
                    } else {
                        anterior = anterior.getAnterior();
                    }
                    pos--;
                }
                if (verificarAdd == false) {
                    addMeio(pos, elemento);
                }
            }

        }
    }

    void numeroPrimo() {
        Cel atual = primeira;
        for (int i = 0; i < 999; i++) {

            if (atual.getElementInt() > 1) {

                if (verfPrimo(atual.getElementInt())) {
                    System.out.println("Num primo --> " + atual.getElementInt());

                    Cel anterior = atual.getAnterior();
                    if (atual.getProxima() == null) {
                        anterior.setProxima(null);
                        ultima = atual;
                        tamanho--;
                    } else {
                        Cel proxima = atual.getProxima();
                        anterior.setProxima(proxima);
                        proxima.setAnterior(anterior);
                        atual = proxima;
                        tamanho--;
                    }
                } else {
                    atual = atual.getProxima();
                }
            } else {
                atual = atual.getProxima();
            }

        }

    }

    boolean verfPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if ((numero % j) == 0) {
                return false;
            } 
        }
        return true;
    }

}