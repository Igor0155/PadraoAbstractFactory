package abstractfactory;

public class FaturaPessoaFisica implements Fatura {
    public String emitir() {
        return "Fatura para Pessoa Física (CPF)";
    }
}
