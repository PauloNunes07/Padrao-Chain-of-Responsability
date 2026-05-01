package Middlewares;

import handler.Middleware;
import requisicao.Requisicao;

public class LogMiddleware extends Middleware {
    @Override
    public boolean processar(Requisicao request) {
        System.out.println("LOG: Requisição processada");
        if(proximo != null) {
           return proximo.processar(request);
        }
        return true;
    }
}
