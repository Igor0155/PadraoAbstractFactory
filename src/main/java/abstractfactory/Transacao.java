package abstractfactory;

public class Transacao {
    private Fatura fatura;
    private Recibo recibo;

    public Transacao(FabricaDocumentosFiscais fabrica) {
        this.fatura = fabrica.createFatura();
        this.recibo = fabrica.createRecibo();
    }

    public String emitirFatura() {
        return this.fatura.emitir();
    }

    public String emitirRecibo() {
        return this.recibo.emitir();
    }
}
