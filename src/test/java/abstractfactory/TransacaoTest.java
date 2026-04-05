package abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    @Test
    void deveEmitirReciboPessoaFisica() {
        FabricaDocumentosFiscais fabrica = new FabricaPessoaFisica();
        Transacao transacao = new Transacao(fabrica);
        assertEquals("Recibo Simples para Pessoa Física", transacao.emitirRecibo());
    }

    @Test
    void deveEmitirReciboPessoaJuridica() {
        FabricaDocumentosFiscais fabrica = new FabricaPessoaJuridica();
        Transacao transacao = new Transacao(fabrica);
        assertEquals("Recibo Detalhado com Retenção de Impostos (PJ)", transacao.emitirRecibo());
    }

    @Test
    void deveEmitirFaturaPessoaFisica() {
        FabricaDocumentosFiscais fabrica = new FabricaPessoaFisica();
        Transacao transacao = new Transacao(fabrica);
        assertEquals("Fatura para Pessoa Física (CPF)", transacao.emitirFatura());
    }

    @Test
    void deveEmitirFaturaPessoaJuridica() {
        FabricaDocumentosFiscais fabrica = new FabricaPessoaJuridica();
        Transacao transacao = new Transacao(fabrica);
        assertEquals("Fatura para Pessoa Jurídica (CNPJ)", transacao.emitirFatura());
    }
}