package abstractfactory;

public class ReciboPessoaJuridica implements Recibo {
    public String emitir() {
        return "Recibo Detalhado com Retenção de Impostos (PJ)";
    }
}
