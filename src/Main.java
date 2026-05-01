import Middlewares.*;
import handler.Middleware;
import requisicao.Requisicao;

public class Main {
    public static void main(String[] args) {

        Middleware auth = new AuthMiddlewares();
        Middleware permissao = new PermissaoMiddleware();
        Middleware validacao = new ValidacaoMiddleware();
        Middleware log = new LogMiddleware();
        Middleware controller = new ControllerMiddleware();

        auth.setProximo(permissao);
        permissao.setProximo(validacao);
        validacao.setProximo(log);
        log.setProximo(controller);

        // 1° Cenário válido
        System.out.println("========= 1° Cenário VÁLIDO ========");
        Requisicao request1 = new Requisicao("admin", "valido", "admin", true);
        auth.processar(request1);

        // 2° Cenário token inválido
        System.out.println("========= 2° Cenário Token Inválido ========");
        Requisicao request2 = new Requisicao("admin", "ERRADO", "ADMIN", true);
        auth.processar(request2);

        // 3° Cenário sem permissão
        System.out.println("========= 3° Cenário  Sem permissão ========");
        Requisicao request3 = new Requisicao("admin", "valido", "user", true);
        auth.processar(request3);

        // 4° Cenário dados inválido
        System.out.println("========= 4° Cenário dados inválidos ========");

        Requisicao request4 = new Requisicao("admin", "valido", "ADMIN", false);
        auth.processar(request4);




    }
}
