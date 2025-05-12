package exception;

public class ContaException extends Exception {

    private String error;

    public ContaException(String error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        String mensagem = "Erro: ";
        switch (error) {
            case "RF01EX01":
                mensagem += "Valor inválido para depósito.";
                break;
            case "RF01EX02":
                mensagem += "Sem saldo suficiente para o saque.";
                break;
            default:
                mensagem += "Erro desconhecido.";
                break;
        }
        return mensagem;
    }
}