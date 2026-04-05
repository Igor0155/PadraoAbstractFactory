package abstractfactory;

public class FabricaPessoaJuridica implements FabricaDocumentosFiscais {
    @Override
    public Fatura createFatura() {
        return new FaturaPessoaJuridica();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboPessoaJuridica();
    }
}