package Middlewares;

import handler.Middleware;
import requisicao.Requisicao;

public class LogMiddleware extends Middleware {
    @Override
    public boolean processar(Requisicao request) {
        System.out.println("LOG: Requisição processada");
        return proximo.processar(request);
    }
}
