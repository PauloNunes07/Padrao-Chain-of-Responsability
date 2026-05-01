package Middlewares;

import handler.Middleware;
import requisicao.Requisicao;

public class AuthMiddlewares extends Middleware {
    @Override
    public boolean processar(Requisicao request) {
        if (request.getToken().equalsIgnoreCase("INVALIDO")) {
            System.out.println("AUTH: Token inválido → acesso negado");
            return false;

        }
        if(proximo != null) {
            return proximo.processar(request);

        }
        return true;

    }
}

