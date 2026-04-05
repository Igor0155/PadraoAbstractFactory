package abstractfactory;

public class ReciboPessoaFisica implements Recibo {
    public String emitir() {
        return "Recibo Simples para Pessoa Física";
    }
}
