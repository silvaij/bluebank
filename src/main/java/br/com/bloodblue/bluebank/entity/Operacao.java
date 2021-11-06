package br.com.bloodblue.bluebank.entity;

public enum Operacao {

    CREDITO("Crédito"),
    DEBITO("Débito"),
    PIX_ENVIADO("Pix enviado"),
    PIX_RECEBIDO("Pix recebido");

    private String operacao;

    Operacao(String operacao) {
        this.operacao = operacao;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}
