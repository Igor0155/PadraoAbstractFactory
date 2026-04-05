package abstractfactory;

public class FaturaPessoaJuridica implements Fatura {
    public String emitir() {
        return "Fatura para Pessoa Jurídica (CNPJ)";
    }
}
