package abstractfactory;

public class FabricaPessoaFisica implements FabricaDocumentosFiscais {
    @Override
    public Fatura createFatura() {
        return new FaturaPessoaFisica();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboPessoaFisica();
    }

}
