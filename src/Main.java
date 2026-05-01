import Middlewares.*;
import handler.Middleware;
import requisicao.Requisicao;

public class Main {
    public static void main(String[] args) {
        System.out.println("HEllo");
        Middleware auth = new AuthMiddlewares();
        Middleware permissao = new PermissaoMiddleware();
        Middleware validacao = new ValidacaoMiddleware();
        Middleware log = new LogMiddleware();
        Middleware controller = new ControllerMiddleware();

        auth.setProximo(permissao);
        permissao.setProximo(validacao);
        validacao.setProximo(log);


        Requisicao request1 = new Requisicao("admin", "valido", "admin", true);

    }
}
