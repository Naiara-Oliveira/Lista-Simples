import java.util.Objects;

public class No<T> {
    public T informacaoPrincipal;
    public No<T> proximo;

    No() {
        //this(-1);
        this.proximo = null;
    }

    No(T valor) {
        this.informacaoPrincipal = valor;
        this.proximo = null;

    }

    public T getInformacaoPrincipal() {
        return informacaoPrincipal;
    }

    public void setInformacaoPrincipal(T informacaoPrincipal) {
        this.informacaoPrincipal = informacaoPrincipal;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

}
