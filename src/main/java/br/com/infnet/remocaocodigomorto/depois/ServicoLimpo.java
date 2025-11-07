package br.com.infnet.remocaocodigomorto.depois;

public class ServicoLimpo {
    public void processar(String dados) {
        validar(dados);
        salvar(dados);
    }

    private void salvar(String dados) {
    }

    private void validar(String dados) {
    }

    public void configurar(int valor) {
        System.out.println(valor);
    }
}
