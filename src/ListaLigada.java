public class ListaLigada<T extends Comparable<T>> {

    private No<T> inicioLista, ultimo;

    public ListaLigada() {
        inicioLista = new No();
        inicioLista.proximo = null;
        ultimo = inicioLista;
    }

    public boolean isEmpty() {
        return (this.inicioLista == this.ultimo);
    }

    public void insere(T valor) {
        ultimo.proximo = new No();
        ultimo = this.ultimo.proximo;
        ultimo.informacaoPrincipal = valor;
    }

    public void inserirFinal(T obj) {
        No<T> inicio = inicioLista;
        No<T> auxiliar = new No(obj);
        auxiliar.setInformacaoPrincipal(obj);
        auxiliar.setProximo(null);

        if (inicioLista == null) {
            inicioLista = auxiliar;

        } else {
            while (inicio.getProximo() != null) {
                inicio = inicio.getProximo();
            }
            inicio.setProximo(auxiliar);
        }
    }

    public void insereOrdenado(T valor) {
        if (this.isEmpty()) {
            insere(valor);
        } else {
            No<T> aux = this.inicioLista;
            while (aux.proximo != null && aux.proximo.informacaoPrincipal.compareTo(valor) < 0){//< valor
                aux = aux.proximo;
                if (aux.proximo == null) {
                    break;
                }
            }

            No prox = aux.proximo;
            aux.proximo = new No();
            aux = aux.proximo;
            aux.informacaoPrincipal = valor;
            aux.proximo = prox;
        }
    }

    public void imprime() {
        System.out.println("- - - Os itens da lista são - - -");
        No aux = this.inicioLista.proximo;
        while (aux != null) {
            System.out.println(aux.informacaoPrincipal);
            aux = aux.proximo;
        }
        System.out.println("- - - -");
    }

    public void buscar(T dato) {


        No<T> q = inicioLista;
        while (q != null) {
            if (q.getInformacaoPrincipal() == dato) {
                System.out.println("encontrei " + dato);
            }
            q = q.getProximo();
        }
    }
    public T getInicioLista() {
        if (this.isEmpty()) {
            return  null;
        }
        return this.inicioLista.proximo.informacaoPrincipal;

    }

}