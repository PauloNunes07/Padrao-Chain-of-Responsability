package Middlewares;

import handler.Middleware;
import requisicao.Requisicao;

public class ValidacaoMiddleware extends Middleware {
    @Override
    public boolean processar(Requisicao request) {
        if(!request.getDadosValidos()) {
            System.out.println("VALIDAÇÃO: Dados inválidos");
            return false;
        }

        return proximo.processar(request);
    }
}
