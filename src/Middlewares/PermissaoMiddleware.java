package Middlewares;

import handler.Middleware;
import requisicao.Requisicao;

public class PermissaoMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao request) {
        if(!request.getPermisao().equalsIgnoreCase("ADMIN")) {
            System.out.println("PERMISSÃO: Acesso negado");
            return false;
        }
        if(proximo != null) {
            proximo.processar(request);
        }
        return true;
    }
}
