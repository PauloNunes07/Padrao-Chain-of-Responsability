package requisicao;

public class Requisicao {
    private String usuario;
    private String token;
    private String permisao;
    private boolean dadosValidos;

    public Requisicao(String usuario, String token, String permisao, boolean dadosValidos) {
        this.usuario = usuario;
        this.token = token;
        this.permisao = permisao;
        this.dadosValidos = dadosValidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    public String getPermisao() {
        return permisao;
    }

    public boolean getDadosValidos() {
        return dadosValidos;
    }
}
