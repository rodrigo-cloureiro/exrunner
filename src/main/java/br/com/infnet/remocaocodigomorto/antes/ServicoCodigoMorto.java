package br.com.infnet.remocaocodigomorto.antes;

public class ServicoCodigoMorto {
    private int contadorObsoleto;

    public void processar(String dados) {
        validar(dados);
        salvar(dados);
    }

    private void metodoAntigo() {
        System.out.println("Este método não é usado!");
    }

    private void validar(String dados) {
        // Validação
    }

    private void salvar(String dados) {
        // Salvamento
    }

    public void configurar(String parametroNaoUsado, int valor) {
        System.out.println(valor);
    }
}
