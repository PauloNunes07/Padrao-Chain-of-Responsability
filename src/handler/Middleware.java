package handler;

import requisicao.Requisicao;

public abstract class Middleware {
    protected Middleware proximo;

    public void setProximo(Middleware proximo) {
        this.proximo = proximo;
    }

    public abstract boolean processar(Requisicao request);
}
