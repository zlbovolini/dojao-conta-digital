package br.com.zup.conta.digital.contas.creditar;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.Optional;

import static com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES;

public class CreditaRequest {


    @Positive @NotNull
    private BigDecimal valor;

    @JsonCreator(mode = PROPERTIES)
    public CreditaRequest(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

}
