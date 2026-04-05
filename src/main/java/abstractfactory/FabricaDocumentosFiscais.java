package abstractfactory;

public interface FabricaDocumentosFiscais {
    Fatura createFatura();

    Recibo createRecibo();
}
