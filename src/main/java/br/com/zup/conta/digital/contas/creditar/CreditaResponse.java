package br.com.zup.conta.digital.contas.creditar;

import br.com.zup.conta.digital.contas.compartilhado.Conta;

import java.math.BigDecimal;

public class CreditaResponse {

    private Long idConta;
    private Long idCliente;
    private BigDecimal valor;

    public CreditaResponse(Conta conta, BigDecimal valor) {
        idConta = conta.getId();
        idCliente = conta.getCliente().getId();
        this.valor = valor;
   }

    public Long getIdConta() {
        return idConta;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
