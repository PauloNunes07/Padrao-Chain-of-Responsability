package Middlewares;

import handler.Middleware;
import requisicao.Requisicao;

public class ControllerMiddleware extends Middleware {
    @Override
    public boolean processar(Requisicao request) {
        System.out.println("CONTROLLER: Requisição processada com sucesso");
        return true;
    }
}
