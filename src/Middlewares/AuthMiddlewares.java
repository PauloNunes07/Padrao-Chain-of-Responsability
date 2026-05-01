package Middlewares;

import handler.Middleware;
import requisicao.Requisicao;

public class AuthMiddlewares extends Middleware {
    @Override
    public boolean processar(Requisicao request) {
        if (!request.getToken().equalsIgnoreCase("VALIDO")) {
            System.out.println("AUTH: Token inválido → acesso negado");
            return false;

        }
        else if(proximo != null) {
            return proximo.processar(request);

        }
        return true;

    }
}

